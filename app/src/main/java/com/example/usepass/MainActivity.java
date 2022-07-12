package com.example.usepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button loginbtn, clrbtn;
    EditText uname, pwd;
    String getuname, getpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        clrbtn = (Button) findViewById(R.id.clrbtn);

        uname = (EditText) findViewById(R.id.uname);
        pwd = (EditText) findViewById(R.id.pwd);

        loginbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                getuname = uname.getText().toString();
                getpwd = pwd.getText().toString();

                if (getuname.matches("brij") && getpwd.matches("brij")) {

                    Intent i = new Intent(MainActivity.this, HomeScreen.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, ""+uname + "+pwd" , Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity.this,
                            "enter correct username & password", Toast.LENGTH_LONG).show();

                }


            }
        });

        clrbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                uname.setText("");
                pwd.setText("");


            }
        });
    }
}