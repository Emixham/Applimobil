package fr.epsi.applimobil;

import org.json.JSONException;
import org.json.JSONObject;

class Categorie {

    int category_id;
    String title;
    String products_url;

    public Categorie(JSONObject newCat) throws JSONException {
        try {
            this.category_id = (int) newCat.get("category_id");
            this.title = (String) newCat.get("title");
            this.products_url = (String) newCat.get("products_url");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducts_url() {
        return products_url;
    }

    public void setProducts_url(String products_url) {
        this.products_url = products_url;
    }
}
