package com.itp.actvtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        listView=findViewById(R.id.list_view);

       String[] countries=getResources().getStringArray(R.array.countries);
     /*   ArrayList<String> countries = new ArrayList<>();
        countries.add("Brazil");
        countries.add("South Africa");
        countries.add("China");
        countries.add("Saudi Arebia");*/
        ArrayAdapter<String> adapter = new ArrayAdapter<>//since java 7..
                (this, android.R.layout.simple_list_item_single_choice, countries);

        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);
        listView.setAdapter(adapter);


    }
}