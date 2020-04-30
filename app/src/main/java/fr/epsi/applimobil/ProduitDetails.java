package fr.epsi.applimobil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

public class ProduitDetails  extends AppliActivity {
    private Produit produit;

    public static void display(AppliActivity activity, Produit produit){
        Intent intent = new Intent(activity, ProduitDetails.class);
        intent.putExtra("product", (Parcelable) produit);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_produit);
        showBackBtn();

        produit = (Produit) getIntent().getExtras().get("product");

        ImageView imageViewProduct = findViewById(R.id.imageViewProduct);

        TextView textViewDescription = findViewById(R.id.textViewDescription);
        textViewDescription.setText(produit.getDescription());



    }
}
