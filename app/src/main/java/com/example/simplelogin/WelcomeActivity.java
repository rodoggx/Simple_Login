package com.example.simplelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView loginName;
    private TextView loginEmail;
    private TextView loginPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        loginName = (TextView) findViewById(R.id.name);
        String name = getIntent().getStringExtra("loginUser");
        loginName.setText(name);

        loginEmail = (TextView) findViewById(R.id.email);
        String email = getIntent().getStringExtra("loginEmail");
        loginEmail.setText(email);

        loginPW = (TextView) findViewById(R.id.password);
        String password = getIntent().getStringExtra("loginPW");
        loginPW.setText(password);
    }
}
