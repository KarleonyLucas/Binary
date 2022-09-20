package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hexadecimal extends AppCompatActivity {
    TextView tv_hb;
    TextView tv_hd;
    TextView tv_ho;
    EditText et_hb;
    EditText et_hd;
    EditText et_ho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexadecimal);
        Toast.makeText(this, "HEXADECIMAL", Toast.LENGTH_SHORT).show();
        tv_hb = findViewById(R.id.tv_hb) ;
        tv_hd = findViewById(R.id.tv_hd) ;
        tv_ho = findViewById(R.id.tv_ho) ;
        et_hb = findViewById(R.id.et_hb) ;
        et_hd = findViewById(R.id.et_hd) ;
        et_ho = findViewById(R.id.et_ho) ;
    }
    public void btn_hb(View v){
        String hexadecimal = et_hb.getText().toString();
        int h = Integer.valueOf(hexadecimal, 16);
        String binario = Integer.toBinaryString(h);
        tv_hb.setText(binario);
    }
    public void btn_hd(View v){
        String hexadecimal = et_hd.getText().toString();
        int h = Integer.valueOf(hexadecimal, 16);
        String decimal = Integer.toString(h);
        tv_hd.setText(decimal);
    }
    public void btn_ho(View v){
        String hexadecimal = et_ho.getText().toString();
        int h = Integer.valueOf(hexadecimal, 16);
        String octal = Integer.toOctalString(h);
        tv_ho.setText(octal);
    }
    public void imagereturn(View v){
       this.finish();
    }
}
