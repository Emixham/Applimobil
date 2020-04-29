package fr.epsi.applimobil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView title = findViewById(R.id.textNomAppli);
        title.setText("Epsi");
    Button buttonGrp = findViewById(R.id.buttonGrp);
    buttonGrp.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view){
            setContentView(R.layout.activity_groupinfo);
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
