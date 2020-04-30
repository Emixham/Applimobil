package fr.epsi.applimobil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import tp.android_espi.ProduitAdapter;

public class produitListe extends AppliActivity {
    private ArrayList<Produit> products;
    private tp.android_espi.ProduitAdapter productListAdapter;

    public static void display(AppliActivity activity, Produit produit){
        Intent intent = new Intent(activity, produitListe.class);
        intent.putExtra("produit", (Parcelable) produit);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_list);
        Categorie categorie = (Categorie) getIntent().getExtras().get("categorie");
        products = new ArrayList<>();
        showBackBtn();

        setTitle(categorie.getTitle());
        ListView listView = findViewById(R.id.listView_produits;
        productListAdapter = new ProduitAdapter(this,R.layout.activity_products_list, products);
        listView.setAdapter(productListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //ProduitListDetailsActivity.display(ProductListActivity.this,products.get(position));
            }
        });

        String url = categorie.getProducts_url();


        new HttpRequest(url, new HttpRequest.HttpAsyncTaskListener() {
            @Override
            public void webServiceDone(String result) {
                initData(result);
            }

            @Override
            public void webServiceError(Exception e) {
                //displayToast(e.getMessage());
            }
        }).execute();


    }

    private void initData(String data) {
        try {
            JSONObject jsonObject;
            jsonObject=new JSONObject(data);
            JSONArray jsonArray=jsonObject.getJSONArray("items");
            for(int i=0;i<jsonArray.length();i++){
                Produit produit =new Produit(jsonArray.getJSONObject(i));
                products.add(produit);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
}
