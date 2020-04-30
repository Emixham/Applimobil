package tp.android_espi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

//import com.squareup.picasso.Picasso;

import java.util.List;

import fr.epsi.applimobil.Produit;
import fr.epsi.applimobil.R;


public class ProduitAdapter extends ArrayAdapter<Produit> {


    public ProduitAdapter(@NonNull Context context, int ressource, @NonNull List<Produit> objects){
        super(context,ressource,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater li = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView =  li.inflate(R.layout.c_produit, null);

        TextView textViewNomProduit=convertView.findViewById(R.id.textView_pro);
        TextView textViewDescription = convertView.findViewById(R.id.textViewDescription);
        ImageView imageViewProduct = convertView.findViewById(R.id.imageViewProduit);


        Produit produit = getItem(position);

        textViewNomProduit.setText(produit.getName());
        textViewDescription.setText(produit.getDescription());
        //Picasso.get().load(produit.getImageUrl()).into(imageViewProduct);


        return convertView;
    }
}
