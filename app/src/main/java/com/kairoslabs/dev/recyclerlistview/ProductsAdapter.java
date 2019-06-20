package com.kairoslabs.dev.recyclerlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by giovannidelgado on 6/19/19.
 */

public class ProductsAdapter extends ArrayAdapter<Product> {
    public ProductsAdapter(Context context, ArrayList<Product> products) {
        super(context, 0, products);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Product product = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_product, parent, false);
        }
        // Lookup view for data population
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);
        // Populate the data into the template view using the data object
        tvName.setText(product.name);
        tvPrice.setText(product.price);
        // Return the completed view to render on screen
        return convertView;
    }
}