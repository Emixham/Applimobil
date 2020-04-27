package fr.epsi.applimobil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class categoriesListe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_liste);
    }
    private Object getCategoriesList(){
        try {
            java.net.URL url = null;
            url = new URL("http://djemam.com/epsi/categories.json");
            HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            conn.setDoOutput( true );
            conn.setInstanceFollowRedirects( false );
            conn.setRequestMethod( "GET" );
            conn.setRequestProperty( "Content-Type", "application/json");
            conn.setRequestProperty( "charset", "utf-8");
            conn.setUseCaches(false);
            try {
                conn.connect();
                InputStream in = new BufferedInputStream(conn.getInputStream());
                return convertStreamToString(in);
            } finally {
                conn.disconnect();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return e;
        } catch (IOException e) {
            e.printStackTrace();
            return e;
        }
    }
    private String convertStreamToString(InputStream is){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));

            StringBuffer stringBuffer = new StringBuffer("");
            String line;

            String NL = System.getProperty("line.separator");
            while ((line = bufferedReader.readLine()) != null)
            {
                stringBuffer.append(line + NL);
            }
            bufferedReader.close();
            return stringBuffer.toString();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
