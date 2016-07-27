package com.example.simplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";
    private EditText User;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view) {
        User = (EditText) findViewById(R.id.inputUser);

        Log.d(TAG, "Login: " + User.getText());

        if (true) {
            Intent intent = new Intent(this, LoginActivity.class);
            intent.putExtra("mainUser", User.getText().toString());
            startActivity(intent);
        }
    }
}
