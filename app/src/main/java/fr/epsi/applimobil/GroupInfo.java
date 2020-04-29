package fr.epsi.applimobil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GroupInfo {
    public class GroupInfoActivity extends AppliActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_groupinfo);
            //showBackBtn();
            TextView title = findViewById(R.id.textNomAppli);
            title.setText("Infos");
            Button buttonE1 = findViewById(R.id.buttonE1);
            buttonE1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view){
                    Log.i("test","click btn E1");
                    setContentView(R.layout.activity_studentinfo);
                }
            });
            Button buttonE2 = findViewById(R.id.buttonE2);
            buttonE2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view){
                    Log.i("test","click btn E2");
                    setContentView(R.layout.activity_studentinfo);
                }
            });
        }

    }
}
