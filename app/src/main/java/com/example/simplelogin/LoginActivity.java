package com.example.simplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivityTAG_";
    private TextView loginUser;
    private EditText loginEmail;
    private EditText loginPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        loginUser = (TextView) findViewById(R.id.loginUser);
        String userName = getIntent().getStringExtra("mainUser");
        loginUser.setText(userName);
    }

    public void signup(View view) {
        loginEmail = (EditText) findViewById(R.id.loginEmail);
        loginPW = (EditText) findViewById(R.id.loginPW);

        if (true) {
            Intent intent = new Intent(this, WelcomeActivity.class);
            intent.putExtra("loginUser", loginUser.getText().toString());
            intent.putExtra("loginPW", loginPW.getText().toString());
            intent.putExtra("loginEmail", loginEmail.getText().toString());
            startActivity(intent);
        }
    }
}
