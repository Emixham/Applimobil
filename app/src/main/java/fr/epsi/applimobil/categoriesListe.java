package fr.epsi.applimobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class categoriesListe extends AppliActivity {

    private CategorieAdapter categorieAdapter;
    private ArrayList categoriesListe;

    public static void display(AppliActivity activity , Categorie categorie) {
       Intent intent = new Intent(activity, categoriesListe.class);
       intent.putExtra("categorie", (Parcelable) categorie) ;
       activity.startActivity(intent);
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_liste);
        showBackBtn();
        categoriesListe = new ArrayList<>();
        ListView listView = findViewById(R.id.listView_categories);
        categorieAdapter = new CategorieAdapter(this, R.layout.c_categories, categoriesListe);
        listView.setAdapter(categorieAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              // ProduitList.display(CategorieActivity.this,categoriesListe.get(position));
            }
        });

        String url = "http://djemam.com/epsi/categories.json";

        new  HttpRequest(url, new HttpRequest.HttpAsyncTaskListener() {
            @Override
            public void webServiceDone(String result) {
                initData(result);
            }

            @Override
            public void webServiceError(Exception e) {

            }
        }).execute();

    }
    private void initData(String data) {
        try {
            JSONObject jsonObject;
            jsonObject=new JSONObject(data);
            JSONArray jsonArray= jsonObject.getJSONArray("items");
            for(int i=0;i<jsonArray.length();i++){
                Categorie categorie=new Categorie(jsonArray.getJSONObject(i));
                categoriesListe.add(categorie);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
