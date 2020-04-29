package fr.epsi.applimobil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StudentInfo extends AppliActivity  {

    public StudentInfo() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentinfo);
        showBackBtn();
        Intent intent = getIntent();
        TextView text = findViewById(R.id.textNomAppli);
        text.setText(intent.getStringExtra("nom"));
        TextView nom = findViewById(R.id.Nom);
        nom.setText(intent.getStringExtra("nom"));
        TextView email = findViewById(R.id.email);
        email.setText(intent.getStringExtra("email"));
        TextView groupe = findViewById(R.id.groupe);
        groupe.setText(intent.getStringExtra("groupe"));

    }
}
