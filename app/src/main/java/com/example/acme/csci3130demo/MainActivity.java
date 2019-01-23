/*
CSCI3130,
Jiaqi Cao, B00754380, Assignment 1
January 18, 2019
 */

package com.example.acme.csci3130demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Input;
    EditText user;
    Button go;
    String txt_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input = findViewById(R.id.input);
        go = findViewById(R.id.button);
        user= findViewById(R.id.text);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_user = user.getText().toString();
                if (txt_user.isEmpty()){
                    Toast.makeText(MainActivity.this, "Field can not be empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    Input.setText(txt_user);
                }
            }
        });
    }
}
