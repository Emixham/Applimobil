package fr.epsi.applimobil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GroupInfo extends AppliActivity{

        public GroupInfo() {
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_groupinfo);
            showBackBtn();
            TextView title = findViewById(R.id.textNomAppli);
            title.setText("Infos");
            Button buttonE1 = findViewById(R.id.buttonE1);
            buttonE1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view){

                    Intent intent = new Intent(GroupInfo.this, StudentInfo.class);
                    intent.putExtra("nom","Thibault Linossier");
                    intent.putExtra("email","t.linossier@epsi.fr");
                    intent.putExtra("groupe","Avec Maxime Delcroix");
                    startActivity(intent);
                }
            });
            Button buttonE2 = findViewById(R.id.buttonE2);
            buttonE2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view){

                    Intent intent = new Intent(GroupInfo.this, StudentInfo.class);
                    intent.putExtra("nom","Maxime Delcroix");
                    intent.putExtra("email","m.delcroix@epsi.fr");
                    intent.putExtra("groupe","Avec Thibault Linossier");
                    startActivity(intent);
                }
            });
        }

    }

