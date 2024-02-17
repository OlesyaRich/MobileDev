package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text = "Toast_onCreate";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        Log.e(TAG, "Error_onCreate_Test");
        Log.w(TAG, "Warning_onCreate_Test");
        Log.i(TAG, "Info_onCreate_Test");
        Log.d(TAG, "Debug_onCreate_Test");
        Log.v(TAG, "Verbose_onCreate_Test");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        CharSequence text = "Toast_onStart";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        Log.e(TAG, "Error_onStart_Test");
        Log.w(TAG, "Warning_onStart_Test");
        Log.i(TAG, "Info_onStart_Test");
        Log.d(TAG, "Debug_onStart_Test");
        Log.v(TAG, "Verbose_onStart_Test");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Context context = getApplicationContext();
        CharSequence text = "Toast_onStop";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        Log.e(TAG, "Error_onStop_Test");
        Log.w(TAG, "Warning_onStop_Test");
        Log.i(TAG, "Info_onStop_Test");
        Log.d(TAG, "Debug_onStop_Test");
        Log.v(TAG, "Verbose_onStop_Test");
    }
    @Override
    protected void onDestroy() {
        Context context = getApplicationContext();
        CharSequence text = "Toast_onDestroy";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        Log.e(TAG, "Error_onDestroy_Test");
        Log.w(TAG, "Warning_onDestroy_Test");
        Log.i(TAG, "Info_onDestroy_Test");
        Log.d(TAG, "Debug_onDestroy_Test");
        Log.v(TAG, "Verbose_onDestroy_Test");
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        CharSequence text = "Toast_onPause";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        Log.e(TAG, "Error_onPause_Test");
        Log.w(TAG, "Warning_onPause_Test");
        Log.i(TAG, "Info_onPause_Test");
        Log.d(TAG, "Debug_onPause_Test");
        Log.v(TAG, "Verbose_onPause_Test");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Context context = getApplicationContext();
        CharSequence text = "Toast_onResume";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
        Log.e(TAG, "Error_onResume_Test");
        Log.w(TAG, "Warning_onResume_Test");
        Log.i(TAG, "Info_onResume_Test");
        Log.d(TAG, "Debug_onResume_Test");
        Log.v(TAG, "Verbose_onResume_Test");
    }

    public void b_exitClick(View view) {
        System.exit(0);
    }

}