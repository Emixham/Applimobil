package fr.epsi.applimobil;

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
        TextView title = findViewById(R.id.textNomAppli);
        title.setText("student");
    }
}
