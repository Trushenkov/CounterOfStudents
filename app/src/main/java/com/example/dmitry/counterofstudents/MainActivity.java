package com.example.dmitry.counterofstudents;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Метод для инкрементирования переменной counter при клике на кнопку
     *
     * @param view
     */
    public void onClickBtnAddStudents(View view) {
        counter++;
        TextView counterView = (TextView) findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }

    /**
     * Метод для обнуления переменной counter
     *
     * @param view
     */
    public void onClickBtnClearStudents(View view){
        counter=0;
        TextView counterView = (TextView) findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
}
