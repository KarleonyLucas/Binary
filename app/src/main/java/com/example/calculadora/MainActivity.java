package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
          Toast.makeText(this, "Binary", Toast.LENGTH_SHORT).show();
            }
    public void  btn_decimal (View v) {
        Intent intent = new Intent(MainActivity.this, Decimal.class);
        startActivity(intent);
    }
    public void  btn_octal (View v) {
        Intent intent = new Intent(MainActivity.this, Octal.class);
        startActivity(intent);
    }
    public void  btn_hexadecimal(View v) {
        Intent intent = new Intent(MainActivity.this, Hexadecimal.class);
        startActivity(intent);
    }
    public void  btn_binario (View v) {
        Intent intent = new Intent(MainActivity.this, Binario.class);
        startActivity(intent);
    }

        }


