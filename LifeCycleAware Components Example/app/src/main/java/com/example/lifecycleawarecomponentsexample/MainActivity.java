package com.example.lifecycleawarecomponentsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Owner");
        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Owner");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Owner");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Owner");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: Owner");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: Owner");
    }

}
