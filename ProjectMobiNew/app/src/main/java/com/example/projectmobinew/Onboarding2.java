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

public class Onboarding2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_onbording2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //создание кнопки из второй экрана онбординга
        Button button = findViewById(R.id.button);
        //прикрепляем действие перехода на следующий экран онбординга по нажатию на кнопку
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboarding2.this, Onboarding3.class);
                startActivity(intent);
                finish();
            }
        });

        //создание текста из второго экрана онбоординга
        TextView textView = findViewById(R.id.textView);
        //прикрепляем действие пропуска онбординга по нажатию на текст
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboarding2.this, LanguageSelect.class);
                startActivity(intent);
                finish();
            }
        });
    }
}