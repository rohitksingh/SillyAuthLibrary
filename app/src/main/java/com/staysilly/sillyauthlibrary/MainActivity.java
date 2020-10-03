package com.staysilly.sillyauthlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.staysilly.sillyauth.SillyLoginActivity;

public class MainActivity extends SillyLoginActivity {

    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });
    }

    @Override
    public void startSplashActivity() {

    }

    @Override
    public String getClientID() {
        return getString(R.string.default_web_client_id);
    }
}