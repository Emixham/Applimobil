package fr.epsi.applimobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Collections;

public class categoriesListe extends AppCompatActivity {

    public static void display(AppCompatActivity activity) {
       Intent intent = new Intent(activity, categoriesListe.class);
       activity.startActivity(intent);
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_liste);
        ListView listView = findViewById(R.id.listView_categories) ;
        HttpRequest HtttpR = new HttpRequest("", new HttpRequest.HttpAsyncTaskListener() {
       @Override
        public void webServiceDone(String result) {}

        @Override
        public void webServiceError(Exception e) {}
        }) ;

        try {
           JSONObject categoriesList = (JSONObject) HtttpR.call("http://djemam.com/epsi/categories.json");
           this.initData(categoriesList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    private void initData(JSONObject data) {
        try {

            JSONArray jsonArray= data.getJSONArray("items");
            for(int i=0;i<jsonArray.length();i++){
                Categorie categorie =new Categorie(jsonArray.getJSONObject(i));
                ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_categories_liste,R.id.listView_categories , Collections.singletonList(categorie.title));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
