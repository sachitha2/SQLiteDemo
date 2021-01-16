package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnAll,btnAdd;
    EditText txtName,txtAge;
    Switch sw;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdd = findViewById(R.id.btnAdd);
        btnAll = findViewById(R.id.btnViewAll);
        txtAge = findViewById(R.id.etAge);
        txtName = findViewById(R.id.etName);
        sw = findViewById(R.id.switchCustomerActive);
        lv = findViewById(R.id.lvCustomer);

        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"View All",Toast.LENGTH_LONG).show();
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"ADD",Toast.LENGTH_LONG).show();
            }
        });

    }
}