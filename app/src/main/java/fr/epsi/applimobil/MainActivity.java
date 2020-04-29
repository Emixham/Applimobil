package fr.epsi.applimobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppliActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgBack = findViewById(R.id.imgBack);
        imgBack.setVisibility(View.INVISIBLE);
        TextView title = findViewById(R.id.textNomAppli);
        title.setText("Epsi");
    Button buttonGrp = findViewById(R.id.buttonGrp);
    buttonGrp.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view){
            Log.i("test","click btn grpInfo");

            Intent intent = new Intent(MainActivity.this, GroupInfo.class);
            startActivity(intent);
        }
    });
        Button buttonListProduct = findViewById(R.id.buttonListProduct);
        buttonListProduct.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                setContentView(R.layout.activity_categories_liste);
            }
        });
    }

}
