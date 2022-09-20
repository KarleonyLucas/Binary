package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Decimal extends AppCompatActivity {
    TextView tv_db;
    TextView tv_dh;
    TextView tv_do;
    EditText et_db;
    EditText et_dh;
    EditText et_do;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal);
        Toast.makeText(this, "DECIMAL", Toast.LENGTH_SHORT).show();
        tv_db = findViewById(R.id.tv_db) ;
        tv_dh = findViewById(R.id.tv_dh) ;
        tv_do = findViewById(R.id.tv_do) ;
        et_db = findViewById(R.id.et_db) ;
        et_dh = findViewById(R.id.et_dh) ;
        et_do = findViewById(R.id.et_do) ;
    }
    public void btn_db(View v){
        String decimal = et_db.getText().toString();
        int b = Integer.valueOf(decimal, 10);
        String binario = Integer.toBinaryString(b);
        tv_db.setText(binario);
    }
    public void btn_dh(View v){
        String decimal = et_dh.getText().toString();
        int b = Integer.valueOf(decimal, 10);
        String hexadecimal = Integer.toHexString(b);
        tv_dh.setText(hexadecimal.toUpperCase());
    }
    public void btn_do(View v){
        String decimal = et_do.getText().toString();
        int o = Integer.valueOf(decimal, 10);
        String octal = Integer.toOctalString(o);
        tv_do.setText(octal);
    }
    public void imagereturn(View v){
        this.finish();
    }
}