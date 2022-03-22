package com.example.myapp.active;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import com.example.myapp.R;
import com.example.myapp.adapter.ProductAdapter;
import com.example.myapp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class CustomGridViewExampleActivity extends AppCompatActivity {
    private GridView gridView;
    private List<Product> listLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_grid_view_example_activity);

        gridView = (GridView) findViewById(R.id.gridview);

        listLanguage = new ArrayList<>();
        listLanguage.add(new Product(1, "Cáp chuyển từ Cổng USB sang PS2..."));
        listLanguage.add(new Product(2, "Cáp chuyển từ Cổng USB sang PS2..."));
        listLanguage.add(new Product(3, "Cáp chuyển từ Cổng USB sang PS2..."));
        listLanguage.add(new Product(4, "Cáp chuyển từ Cổng USB sang PS2..."));
        listLanguage.add(new Product(5, "Cáp chuyển từ Cổng USB sang PS2..."));
        listLanguage.add(new Product(6, "Cáp chuyển từ Cổng USB sang PS2..."));
        listLanguage.add(new Product(7, "Cáp chuyển từ Cổng USB sang PS2..."));
        listLanguage.add(new Product(8, "Cáp chuyển từ Cổng USB sang PS2..."));


        ProductAdapter adapter = new ProductAdapter(this, R.layout.item_custom_grid_view, listLanguage);
        gridView.setAdapter(adapter);
    }
}