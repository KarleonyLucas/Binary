package com.example.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Binario extends AppCompatActivity {
    EditText et_bo;
    EditText et_bh;
    EditText et_bd;
    TextView tv_bd;
    TextView tv_bh;
    TextView tv_bo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binario);
        Toast.makeText(this, "BINÁRIO", Toast.LENGTH_SHORT).show();
        tv_bd = findViewById(R.id.tv_bd);
        tv_bh = findViewById(R.id.tv_bh);
        tv_bo = findViewById(R.id.tv_bo);
        et_bd = findViewById(R.id.et_bd);
        et_bh = findViewById(R.id.et_bh);
        et_bo = findViewById(R.id.et_bo);
    }
    public void opera(View v){
        switch (v.getId()){
            case R.id.btn_bd:
                String binariod =et_bd.getText().toString();
                int b = Integer.valueOf((binariod), 2);
                String decimal = Integer.toString(b);
                tv_bd.setText(decimal);
                break;
            case  R.id.btn_bh:
                String binarioh= et_bh.getText().toString();
                int h = Integer.valueOf(binarioh,2);
                String hexadecimal = Integer.toHexString(h);
                tv_bh.setText(hexadecimal.toUpperCase());
                break;
            case  R.id.btn_bo:
                String binarioo = et_bo.getText().toString();
                int o = Integer.valueOf(binarioo, 2);
                String octal = Integer.toOctalString(o);
                tv_bo.setText(octal);
                break;
            case R.id.imagebtn_returnb:
               this.finish();
                break;
        }
    }
}