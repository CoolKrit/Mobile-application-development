package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    private static final String TAG = "MyCarShowroom";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView your_email = findViewById(R.id.signup_email);
        String emailname = getIntent().getStringExtra("email_name_key");
        your_email.setText(your_email.getText().toString() + emailname);
    }

    public void onSignInClick(View v) {
        String emailname = getIntent().getStringExtra("email_name_key");
        sendEmailName(emailname);
    }

    private void sendEmailName(String message) {
        Intent data = new Intent();
        data.putExtra(SignInActivity.ACCESS_EMAIL, message);
        setResult(RESULT_OK, data);
        finish();
        Log.i(TAG, "Переход к SignInActivity");
    }
}
