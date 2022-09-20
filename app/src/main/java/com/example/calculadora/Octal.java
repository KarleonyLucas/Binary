package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Octal extends AppCompatActivity {
    TextView tv_ob;
    TextView tv_od;
    TextView tv_oh;
    EditText et_ob;
    EditText et_od;
    EditText et_oh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octal);
        Toast.makeText(this, "OCTAL", Toast.LENGTH_SHORT).show();
         tv_ob =findViewById(R.id.tv_ob) ;
         tv_od =findViewById(R.id.tv_od) ;
         tv_oh =findViewById(R.id.tv_oh) ;
         et_ob =findViewById(R.id.et_ob) ;
         et_od =findViewById(R.id.et_od) ;
         et_oh =findViewById(R.id.et_oh) ;
    }
    public void btn_ob(View v){
        String octal = et_ob.getText().toString();
        int o = Integer.valueOf(octal, 8);
        String binario = Integer.toBinaryString(o);
        tv_ob.setText(binario);
    }
    public void btn_od(View v){
        String octal = et_od.getText().toString();
        int o = Integer.valueOf(octal, 8);
        String decimal = Integer.toString(o);
        tv_od.setText(decimal);
    }
    public void btn_oh(View v){
        String octal = et_oh.getText().toString();
        int o = Integer.valueOf(octal, 8);
        String hexadecimal = Integer.toHexString(o);
        tv_oh.setText(hexadecimal.toUpperCase());
    }
    public void imagereturn(View v){
       this.finish();
    }
}