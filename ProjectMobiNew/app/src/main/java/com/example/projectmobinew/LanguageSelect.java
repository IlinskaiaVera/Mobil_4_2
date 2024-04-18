package com.example.projectmobinew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LanguageSelect extends AppCompatActivity {

    //функция для отмена выбора кнопки
    private void unsetButton(Button button) {
        button.setSelected(false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_select);

        Button russianButton = findViewById(R.id.russian_button);
        russianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //снимаем выбор с других кнопок
                unsetButton(findViewById(R.id.english_button));
                unsetButton(findViewById(R.id.chinese_button));
                unsetButton(findViewById(R.id.belarus_button));
                unsetButton(findViewById(R.id.kazakh_button));

                //устанавливаем выбор кнопки russian
                russianButton.setSelected(true);
            }
        });

        Button englishButton = findViewById(R.id.english_button);
        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unsetButton(findViewById(R.id.russian_button));
                unsetButton(findViewById(R.id.chinese_button));
                unsetButton(findViewById(R.id.belarus_button));
                unsetButton(findViewById(R.id.kazakh_button));

                //устанавливаем выбор кнопки english
                englishButton.setSelected(true);
            }
        });

        Button chineseButton = findViewById(R.id.chinese_button);
        chineseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unsetButton(findViewById(R.id.russian_button));
                unsetButton(findViewById(R.id.english_button));
                unsetButton(findViewById(R.id.belarus_button));
                unsetButton(findViewById(R.id.kazakh_button));

                //устанавливаем выбор кнопки chinese
                chineseButton.setSelected(true);
            }
        });

        Button belarushButton = findViewById(R.id.belarus_button);
        belarushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unsetButton(findViewById(R.id.russian_button));
                unsetButton(findViewById(R.id.chinese_button));
                unsetButton(findViewById(R.id.english_button));
                unsetButton(findViewById(R.id.kazakh_button));

                //устанавливаем выбор кнопки belarus
                belarushButton.setSelected(true);
            }
        });

        Button kazakhButton = findViewById(R.id.kazakh_button);
        kazakhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the orange color from all buttons
                unsetButton(findViewById(R.id.russian_button));
                unsetButton(findViewById(R.id.chinese_button));
                unsetButton(findViewById(R.id.belarus_button));
                unsetButton(findViewById(R.id.english_button));

                //устанавливаем выбор кнопки kazakh
                kazakhButton.setSelected(true);
            }
        });

        Button choose_button = findViewById(R.id.choose_button);
        //прикрепляем действие перехода на экран логина
        choose_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LanguageSelect.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}