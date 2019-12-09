package com.example.moksh.activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.moksh.R;


public class PinRegistrationActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinregistration);

        Button btnLogin = findViewById(R.id.btnLogin3);
        Button btnLogin1 = findViewById(R.id.btnLogin4);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ConfirmPINActivity.class);
                startActivity(intent);

            }

        });

        btnLogin1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), PatternActivity.class);
                startActivity(intent);

            }
        });
    }

}
