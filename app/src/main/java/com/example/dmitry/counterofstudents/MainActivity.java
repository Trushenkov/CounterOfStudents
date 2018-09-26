package com.example.dmitry.counterofstudents;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "StartActivity";

    private Integer counter = 5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume() {
        super.onResume();

        TextView textView = findViewById(R.id.txt_counter);
        textView.setText(counter.toString());

        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("counter")) {
            counter = savedInstanceState.getInt("counter");
        }
        Log.d(TAG, "onRestoreInstanceState");
    }

    @SuppressLint("SetTextI18n")
    private void resetUI() {
        ((TextView) findViewById(R.id.txt_counter)).setText(counter.toString());
        Log.d(TAG, "resetUI");
    }

    /**
     * Метод для инкрементирования переменной counter при клике на кнопку
     *
     * @param view view
     */
    @SuppressLint("SetTextI18n")
    public void onClickBtnAddStudents(View view) {
        counter++;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }

    /**
     * Метод для обнуления переменной counter
     *
     * @param view view
     */
    @SuppressLint("SetTextI18n")
    public void onClickBtnClearStudents(View view) {
        counter = 0;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
}
