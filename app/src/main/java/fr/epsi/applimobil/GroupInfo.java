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
            Log.i("test","test oncreate");
            Button buttonE1 = findViewById(R.id.buttonE1);
            buttonE1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view){
                    Log.i("test","click btn E1");
                    Intent intent = new Intent(GroupInfo.this, StudentInfo.class);
                    startActivity(intent);
                }
            });
            Button buttonE2 = findViewById(R.id.buttonE2);
            buttonE2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view){
                    Log.i("test","click btn E2");

                    Intent intent = new Intent(GroupInfo.this, StudentInfo.class);
                    startActivity(intent);
                }
            });
        }

    }

