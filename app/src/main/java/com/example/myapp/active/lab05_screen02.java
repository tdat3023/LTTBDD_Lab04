package com.example.myapp.active;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapp.R;
import com.example.myapp.model.Donut;

import org.w3c.dom.Text;

import java.text.NumberFormat;
import java.util.Locale;

public class lab05_screen02 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab05_screen02);

        Intent intentReceived = getIntent();
        Bundle data = intentReceived.getExtras();
        Donut donut = null;

        if(data != null){
             donut = (Donut) data.getSerializable("donut");

        }else{
            Toast.makeText(lab05_screen02.this, "err", Toast.LENGTH_LONG).show();
        }




        TextView tvName = findViewById(R.id.textView44);
        TextView tvPrice = findViewById(R.id.textView46);
        TextView tvTitle =findViewById(R.id.textView45);

        ImageView imageView = (ImageView) findViewById(R.id.imageView28);

        //set value
        Locale locale = new Locale("en", "US");
        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);

        tvPrice.setText(fmt.format(donut.getPrice()));
        tvName.setText(donut.getName());
        tvTitle.setText(donut.getTitle());
        int idProduct = donut.getId();
        switch (idProduct) {
            case 1:
                imageView.setImageResource(R.drawable.donut_yellow1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.green_donut);
                break;
            case 3:
                imageView.setImageResource(R.drawable.green_donut);
                break;
            case 4:
                imageView.setImageResource(R.drawable.donut_red);
                break;
            case 5:
                imageView.setImageResource(R.drawable.donut_yellow1);
                break;
            case 6:
                imageView.setImageResource(R.drawable.tasty_donut);
                break;
            case 7:
                imageView.setImageResource(R.drawable.donut_yellow1);
                break;
            case 8:
                imageView.setImageResource(R.drawable.donut_yellow1);
                break;
            default:
                break;
        }



        //tang giam so luong san pham
        ImageView imageIncrease = (ImageView) findViewById(R.id.imageView31);
        ImageView imageDecrease = (ImageView) findViewById(R.id.imageView30);
        //get number product currenly
        TextView numberTxt = findViewById(R.id.textView49);
        Donut finalDonut = donut;
        imageIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int NewNum = Integer.parseInt( numberTxt.getText().toString());
                int Num = NewNum+1;

                numberTxt.setText(String.valueOf(Num));

                //set total price
                Locale locale = new Locale("en", "US");
                NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);

                tvPrice.setText(fmt.format(totalPrice((finalDonut.getPrice()), Num)));
            }
        });

        imageDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int NewNum = Integer.parseInt( numberTxt.getText().toString());
                int Num = NewNum-1;
                if(Num>0){
                    numberTxt.setText(String.valueOf(Num));
                    tvPrice.setText(fmt.format(totalPrice((finalDonut.getPrice()), Num)));
                }


            }
        });

    }

    public double totalPrice(Double price, int num){
        return price * num;
    }
}
