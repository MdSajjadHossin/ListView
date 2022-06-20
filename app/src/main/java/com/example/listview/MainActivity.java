package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView autoCompleteTextView;
    int[] arrNo = new int[]{1,2,3,4,5};
    ArrayList<String> arrName = new ArrayList<>();
    ArrayList<String> arrId = new ArrayList<>();
    ArrayList<String> arrLanguage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);


        arrName.add("Sajjad");
        arrName.add("Sajid");
        arrName.add("Sourav");
        arrName.add("Sagore");
        arrName.add("Sani");
        arrName.add("Sajjad");
        arrName.add("Sajid");
        arrName.add("Sourav");
        arrName.add("Sagore");
        arrName.add("Sani");
        arrName.add("Sajjad");
        arrName.add("Sajid");
        arrName.add("Sourav");
        arrName.add("Sagore");
        arrName.add("Sani");
        arrName.add("Sajjad");
        arrName.add("Sajid");
        arrName.add("Sourav");
        arrName.add("Sagore");
        arrName.add("Sani");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrName);
        listView.setAdapter(adapter);

        //item listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Toast.makeText(MainActivity.this, "First Item Clicked", Toast.LENGTH_SHORT).show();
                }

            }
        });


        //spinner
        arrId.add("Voter Id");
        arrId.add("Pan Card");
        arrId.add("Adher Card");
        arrId.add("Driving License");
        arrId.add("Birth Certificate");
        arrId.add("Passport");
        arrId.add("University Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, arrId);
        spinner.setAdapter(spinnerAdapter);

        //AutoCompleteTextView
        arrLanguage.add("Bangla");
        arrLanguage.add("Hindi");
        arrLanguage.add("Tamil");
        arrLanguage.add("Telegu");
        arrLanguage.add("Vogpuri");
        arrLanguage.add("Marathi");
        arrLanguage.add("Panjabi");

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrLanguage);
        autoCompleteTextView.setAdapter(actvAdapter);
        autoCompleteTextView.setThreshold(1);


    }
}


