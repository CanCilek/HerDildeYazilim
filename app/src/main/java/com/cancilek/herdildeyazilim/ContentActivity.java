package com.cancilek.herdildeyazilim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);


        Intent intent = getIntent();
        String KonuIcerik = intent.getStringExtra("KonuIcerik");
        textView1.setText(KonuIcerik);
        String DetayIcerik = intent.getStringExtra("DetayIcerik");
        textView2.setText(DetayIcerik);
        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());

    }
}
