package com.example.myapp;

import static android.app.PendingIntent.getActivity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.example.myapp.adapter.DonutAdapter;
import com.example.myapp.adapter.ProductAdapter;
import com.example.myapp.model.Donut;
import com.example.myapp.model.Product;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapp.R;
import com.example.myapp.adapter.ProductAdapter;
import com.example.myapp.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.text.NumberFormat;
public class lab05_screen01 extends AppCompatActivity {
    private ListView listView;
    private List<Donut> listDonut;

    private Button btnDonut;
    private Button btnPinkDonut;
    private Button btnFloading;
    private TextView txtSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab05_screen01);

        listView = (ListView) findViewById(R.id.idListViewDonut);
        btnDonut = (Button) findViewById(R.id.btnDonut);
        btnPinkDonut = (Button) findViewById(R.id.btnPinkDonut);
        btnFloading = (Button) findViewById(R.id.btnFloading);
        txtSearch = (TextView) findViewById(R.id.txtSearch);



        listDonut = new ArrayList<>();

        listDonut.add(new Donut(1, "Tasty Donut", "Spicy tasty donut family" , 2000));
        listDonut.add(new Donut(2, "Pink Donut", "Spicy tasty donut family" , 5000));
        listDonut.add(new Donut(3, "Floating Donut", "Spicy tasty donut family" , 1000));
        listDonut.add(new Donut(4, "Tasty Donut", "Spicy tasty donut family" , 3000));
        listDonut.add(new Donut(5, "Tasty Donut", "Spicy tasty donut family" , 2000));
        listDonut.add(new Donut(6, "Pink Donut", "Spicy tasty donut family" , 6000));
        listDonut.add(new Donut(7, "Floading", "Spicy tasty donut family" , 1000));
        listDonut.add(new Donut(8, "Pink Donut", "Spicy tasty donut family" , 2000));



        DonutAdapter adapter = new DonutAdapter(this, R.layout.donut_layout_lab05_screen01, listDonut);
        listView.setAdapter(adapter);


        btnDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlerShowDonut(v);
            }
        });
        btnPinkDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hanldFilter(v);
            }
        });
        btnFloading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hanldFilter(v);
            }
        });


        txtSearch.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {

            }

            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                btnDonut.setBackgroundResource(R.drawable.button_yellow);
                btnPinkDonut.setBackgroundResource(0);
                btnFloading.setBackgroundResource(0);
                String text = txtSearch.getText().toString();
                List<Donut> newListDonut = new ArrayList<>();
                //loc san pham theo loai
                for(int i = 0; i < listDonut.size(); i++){
                   if(listDonut.get(i).getName().toUpperCase().contains(text.toUpperCase())){
                       newListDonut.add(listDonut.get(i));
                   }
                }
                DonutAdapter adapter = new DonutAdapter( getApplicationContext(), R.layout.donut_layout_lab05_screen01, newListDonut);
                listView.setAdapter(adapter);


            }
        });
    }


    public void hanldFilter(View v){
        Button b = (Button)v;
        String buttonText = b.getText().toString();
//        Toast.makeText(lab05_screen01.this, buttonText.toUpperCase(), Toast.LENGTH_LONG).show();
         List<Donut> newListDonut = new ArrayList<>();
        //loc san pham theo loai
        for(int i = 0; i < listDonut.size(); i++){
            if(buttonText.toUpperCase().equalsIgnoreCase(listDonut.get(i).getName().toUpperCase() )){
                newListDonut.add(listDonut.get(i));
            }
        }
        DonutAdapter adapter = new DonutAdapter(this, R.layout.donut_layout_lab05_screen01, newListDonut);
        listView.setAdapter(adapter);

        btnDonut.setBackgroundResource(0);
        btnPinkDonut.setBackgroundResource(0);
        btnFloading.setBackgroundResource(0);

        v.setBackgroundResource(R.drawable.button_yellow);

    }

    public void handlerShowDonut(View v){
        v.setBackgroundResource(R.drawable.button_yellow);
        btnPinkDonut.setBackgroundResource(0);
        btnFloading.setBackgroundResource(0);
        DonutAdapter adapter = new DonutAdapter(this, R.layout.donut_layout_lab05_screen01, listDonut);
        listView.setAdapter(adapter);
    }
}