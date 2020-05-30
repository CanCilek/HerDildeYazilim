package com.cancilek.herdildeyazilim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);


        final ArrayList<String> DilIsimleri = new ArrayList<>();
        DilIsimleri.add("PYTHON");
        DilIsimleri.add("C#");
        DilIsimleri.add("JAVA");
        DilIsimleri.add("C");


        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,DilIsimleri);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                if (i == 0){
                    Intent intent = new Intent(getApplicationContext(),PythonActivity.class);
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(getApplicationContext(),CSharpActivity.class);
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(getApplicationContext(),JavaActivity.class);
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(getApplicationContext(),CActivity.class);
                    startActivity(intent);
                }



            }
        });

    }
}
