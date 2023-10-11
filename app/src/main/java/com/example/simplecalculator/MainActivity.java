package com.example.simplecalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView tv1,tv2,tv3;
    Button b1,b2,b3,b4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.num1edit);
        ed1.setInputType(InputType.TYPE_CLASS_NUMBER);
        ed2=findViewById(R.id.num2edit);
        ed2.setInputType(InputType.TYPE_CLASS_NUMBER);
        tv1=findViewById(R.id.textView);
        tv2=findViewById(R.id.anstext);
        b1=findViewById(R.id.addbutton);
        b2=findViewById(R.id.subbutton);
        b3=findViewById(R.id.mulbutton);
        b4=findViewById(R.id.divbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(ed1.getText().toString());
                double num2=Double.parseDouble(ed2.getText().toString());
                double ans=num1+num2;
                tv2.setText(""+ans);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(ed1.getText().toString());
                double num2=Double.parseDouble(ed2.getText().toString());
                double ans=num1-num2;
                tv2.setText(""+ans);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(ed1.getText().toString());
                double num2=Double.parseDouble(ed2.getText().toString());
                double ans=num1*num2;
                tv2.setText(""+ans);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(ed1.getText().toString());
                double num2=Double.parseDouble(ed2.getText().toString());
                double ans=num1/num2;
                tv2.setText(""+ans);

            }
        });
    }
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }





}