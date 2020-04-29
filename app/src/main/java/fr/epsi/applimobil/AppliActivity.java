package fr.epsi.applimobil;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;


public class AppliActivity extends MainActivity implements View.OnClickListener {
    protected Application app;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app = getApplication();
    }

    protected void showBackBtn() {
        ImageView imageView = findViewById(R.id.imgBack);
        Log.i("test", "clicklistener");
        //imageView.setVisibility(View.VISIBLE);
        imageView.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Log.i("test","click back btn");
        finish();

    }
}


