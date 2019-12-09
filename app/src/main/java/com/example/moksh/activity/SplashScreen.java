package com.example.moksh.activity;

import android.content.Intent;
import android.os.Bundle;
import com.example.moksh.R;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
@Override
    public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splashscreen);

    new Handler().postDelayed(new Runnable()
    {
        @Override
        public void run()
        {   Intent i= new Intent(SplashScreen.this,LoginActivity.class);
            startActivity(i);
            finish();
           }
    } ,5000);

}

}
