package com.msaggik.seventhlessonapplicationmoderator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание полей для вывода на экран нужных значений
    private Button button; // кнопка обработки информации
    private TextView questionOut; // поле вывода результирующей информации

    // создадим объект нашего алгоритма, чтобы мы могли получить доступ к его методам
    Algorithm algorithm = new Algorithm();

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) { // создание жизненного цикла активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // присваивание жизненному циклу активити представления activity_main

        // присваивание переменным активити элементов представления activity_main
        button = findViewById(R.id.button); // кнопка обработки
        questionOut = findViewById(R.id.questionOut); // поле вывода

        // выполнение действий при нажании кнопки
        button.setOnClickListener(listener); // обработка нажатия кнопки
    }

    // объект обработки нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // вывод сгенерированного вопроса на экран
            questionOut.setText(algorithm.moderator());
        }
    };
}