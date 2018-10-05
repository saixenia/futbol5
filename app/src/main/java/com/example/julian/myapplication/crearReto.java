package com.example.julian.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

public class crearReto extends AppCompatActivity {
    ScrollView scrView;
    TextView textViewCrearReto, textViewTipoReto, textViewCiudad, textViewCancha, textViewFecha, textViewHoraInicio,
            textViewHoraFin, textViewColorUniforme;
    Spinner spinnerReto, spinnerCiudad, spinnerCancha;
    DatePicker pickerFecha;
    TimePicker editTextHoraInicio, editTextHoraFin;
    EditText editTextColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearreto);
        scrView = findViewById(R.id.scrView);
        textViewCrearReto = findViewById(R.id.textViewCrearReto);
        textViewTipoReto = findViewById(R.id.textViewTipoReto);
        spinnerReto = findViewById(R.id.spinnerReto);
        textViewCiudad = findViewById(R.id.textViewCiudad);
        spinnerCiudad = findViewById(R.id.spinnerCiudad);
        textViewCancha = findViewById(R.id.textViewCancha);
        spinnerCancha = findViewById(R.id.spinnerCancha);
        textViewFecha = findViewById(R.id.textViewFecha);
        textViewHoraInicio = findViewById(R.id.textViewHoraInicio);
        editTextHoraInicio = findViewById(R.id.editTextHoraInicio);
        textViewHoraFin = findViewById(R.id.textViewHoraFin);
        editTextHoraFin = findViewById(R.id.editTextHoraFin);
        textViewColorUniforme = findViewById(R.id.textViewColorUniforme);
        editTextColor = findViewById(R.id.editTextColor);




    }
}
