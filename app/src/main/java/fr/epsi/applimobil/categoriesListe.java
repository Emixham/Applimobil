package fr.epsi.applimobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

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
        //HttpRequest.execute();

    }
}
