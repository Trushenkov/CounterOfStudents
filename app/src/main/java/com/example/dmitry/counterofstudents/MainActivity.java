package com.example.dmitry.counterofstudents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "StartActivity";

    private Integer counter = 5;
    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txt_counter);
        Toast.makeText(this, "Method onCreate() is runned", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(this, "Method onStart() is runned", Toast.LENGTH_SHORT).show();
        resetUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
        resetUI();
        Toast.makeText(this, "Method onResume() is runned", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "Method onPause() is runned", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "Method onStop() is runned", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "Method onRestart() is runned", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "Method onDestroy() is runned", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
        Log.d(TAG, "onSaveInstanceState");
        Toast.makeText(this, "Method onSaveInstanceState() is runned", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("counter")) {
            counter = savedInstanceState.getInt("counter");
        }
        Log.d(TAG, "onRestoreInstanceState");
        Toast.makeText(this, "Method onRestoreInstanceState() is runned", Toast.LENGTH_SHORT).show();
    }

    private void resetUI() {
        textView.setText(String.valueOf(counter));
        Log.d(TAG, "resetUI");
        Toast.makeText(this, "Method resetUI() is runned", Toast.LENGTH_SHORT).show();
    }

    /**
     * Метод для инкрементирования переменной counter при клике на кнопку
     *
     * @param view view
     */
    public void onClickBtnAddStudents(View view) {
        counter++;
        resetUI();
        Log.d(TAG, "onClickBtnAddStudents");
        Toast.makeText(this, "Method onClickBtnAddStudents() is runned", Toast.LENGTH_SHORT).show();
    }

    /**
     * Метод для обнуления переменной counter
     *
     * @param view view
     */
    public void onClickBtnClearStudents(View view) {
        counter = 0;
        resetUI();
        Log.d(TAG, "onClickBtnClearStudents");
        Toast.makeText(this, "Method onClickBtnClearStudents() is runned", Toast.LENGTH_SHORT).show();
    }

}
