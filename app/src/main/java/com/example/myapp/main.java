package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapp.adapter.LanguageAdapter;
import com.example.myapp.model.Language;

import java.util.ArrayList;
import java.util.List;

public class main extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab05_screen02);

//        listView = (ListView) findViewById(R.id.idListView);
//        listLanguage = new ArrayList<>();
//        listLanguage.add(new Language(1, "Lập Trình Java", "Shop", "BBQ"));
//        listLanguage.add(new Language(2, "Lập Trình Android", "Shop", "BBQ"));
//        listLanguage.add(new Language(3, "Lập Trình JavaFX", "Shop", "BBQ"));
//        listLanguage.add(new Language(4, "Lập Trình Web", "Shop", "BBQ"));
//        listLanguage.add(new Language(5, "Lập Trình Ruby", "Shop", "BBQ"));
//        listLanguage.add(new Language(6, "Lập Trình C++", "Shop", "BBQ"));
//        listLanguage.add(new Language(7, "Lập Trình PHP", "Shop", "BBQ"));
//        listLanguage.add(new Language(8, "Lập Trình WordPress", "Shop", "BBQ"));
//
//        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_list_view, listLanguage);
//        listView.setAdapter(adapter);

    }
}