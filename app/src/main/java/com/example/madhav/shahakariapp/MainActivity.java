package com.example.madhav.shahakariapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // TODO: Your application init goes here.

//                Intent mInHome = new Intent(MainActivity.this, LoginActivity.class);
//                MainActivity.this.startActivity(mInHome);
//                MainActivity.this.finish();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(R.transition.fade_in,R.transition.fade_out);


            }
        }, 3000);
    }
}
