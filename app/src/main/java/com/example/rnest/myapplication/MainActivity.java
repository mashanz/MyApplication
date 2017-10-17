package com.example.rnest.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final boolean kaloBenar = true;
        if (kaloBenar){
            Log.i(TAG, "Aplikasi jalan dengan Semestinya");
        } else {
            Log.i(TAG, "Aplikasi keknya ada Error deh (???)");
        }
    }
}
