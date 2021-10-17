package com.example.grandebelen_app.logicaFake;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.grandebelen_app.R;

public class TodasMedicionesActivity extends AppCompatActivity {

    private TextView txtMedicis;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todas_mediciones);
        txtMedicis = findViewById(R.id.txtMediciones);

        String datosMedis = getIntent().getStringExtra("datos");

        txtMedicis.setText(datosMedis);

    }
}
