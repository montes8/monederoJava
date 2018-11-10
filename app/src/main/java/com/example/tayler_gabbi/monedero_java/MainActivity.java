package com.example.tayler_gabbi.monedero_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button onClickSesion,onClickReistarte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClickSesion = (Button) findViewById(R.id.button_sesion);
        onClickReistarte = findViewById(R.id.button_register);

        onClickSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(this,LoginActivity.class);
            }
        });

        onClickReistarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentn = new Intent(this,RegistrarActivity.class);
            }
        });

    }
}
