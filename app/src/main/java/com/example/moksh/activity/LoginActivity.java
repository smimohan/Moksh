package com.example.moksh.activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.moksh.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = findViewById(R.id.editText);
        final EditText etPhone = findViewById(R.id.editText2);
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String username = etUsername.getText().toString();
                String phone = etPhone.getText().toString();
                if (username.equals("username") && phone.equals("1234567890")) {
                    Intent intent = new Intent(getApplicationContext(), OtpActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });
    }
}


