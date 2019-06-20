package com.kairoslabs.dev.recyclerlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by giovannidelgado on 6/19/19.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Construct the data source
        ArrayList<Product> arrayOfProducts = new ArrayList<>();
        // Create the adapter to convert the array to views
        ProductsAdapter prodAdapter = new ProductsAdapter(this, arrayOfProducts);
        Product newProduct = new Product("Product 1","1", "158.00", "1 Pz");
        prodAdapter.add(newProduct);
        Product newProduct2 = new Product("Product 2","2", "273.00", "0 Pz");
        prodAdapter.add(newProduct2);
        Product newProduct3 = new Product("Product 3","16", "284.00", "4 Pz");
        prodAdapter.add(newProduct3);
        Product newProduct4 = new Product("Product 4","12", "562.00", "2 Pz");
        prodAdapter.add(newProduct4);
        // Attach the adapter to a ListView
        ListView listView;
        listView = findViewById(R.id.lvProducts);
        listView.setAdapter(prodAdapter);
    }
}