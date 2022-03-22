package com.example.myapp.adapter;


import static android.support.v4.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapp.R;
import com.example.myapp.active.lab05_screen02;
import com.example.myapp.lab05_screen01;
import com.example.myapp.main;
import com.example.myapp.model.Donut;


import java.text.NumberFormat;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;

public class DonutAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Donut> listDonut;
    private int positionSelect = -1;

    public DonutAdapter(Context context, int idLayout, List<Donut> listDonut) {
        this.context = context;
        this.idLayout = idLayout;
        this.listDonut = listDonut;
    }

    public DonutAdapter(TextWatcher textWatcher, int donut_layout_lab05_screen01, List<Donut> newListDonut) {
    }

    @Override
    public int getCount() {
        if (listDonut.size() != 0 && !listDonut.isEmpty()) {
            return listDonut.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.textView40);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.textView43);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.textView41);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView26);
        final ConstraintLayout linearLayout = (ConstraintLayout) convertView.findViewById(R.id.idLinearLayout);
        final Donut donut = listDonut.get(position);

        if (listDonut != null && !listDonut.isEmpty()) {
            Locale locale = new Locale("en", "US");
            NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);

            tvPrice.setText(fmt.format(donut.getPrice()));
            tvName.setText(donut.getName());
            tvTitle.setText(String.valueOf(donut.getTitle()));


            int idLanguage = donut.getId();
            switch (idLanguage) {
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
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //    Toast.makeText(context, String.valueOf(donut.getPrice()), Toast.LENGTH_LONG).show();
//                positionSelect = position;
//                notifyDataSetChanged();
                Intent i = new Intent(context, lab05_screen02.class);

                Bundle data1 = new Bundle();
                data1.putSerializable("donut",listDonut.get(position) );
                i.putExtras(data1);

                context.startActivity(i);
            }
        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.rgb(244, 252, 217));
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        return convertView;
    }
}

