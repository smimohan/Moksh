package com.example.moksh.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.moksh.R;


public class OtpActivity extends AppCompatActivity

{
@Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_otp);
    final EditText etPin = findViewById(R.id.editText4);
    Button btnLogin2 = findViewById(R.id.btnLogin2);
    btnLogin2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String Pin = etPin.getText().toString();

            if (Pin.equals("1234")) {
                Intent intent = new Intent(getApplicationContext(), PinRegistrationActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_LONG)
                        .show();
            }
        }
    });


}}



