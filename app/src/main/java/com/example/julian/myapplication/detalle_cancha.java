package com.example.julian.myapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class detalle_cancha extends AppCompatActivity {
    ImageView imageView2;
    ListView _dynamic_lista;
    FloatingActionButton add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_cancha);
        imageView2 = findViewById(R.id.imageView2);
        _dynamic_lista = findViewById(R.id._dynamic_lista);
        add = findViewById(R.id.add);

    }
}
