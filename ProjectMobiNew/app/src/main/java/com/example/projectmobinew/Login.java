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

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        //функция перехода на экран выбора пароля если забыли пароль
        TextView forgotPassButton = findViewById(R.id.textForgotPass);
        forgotPassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, SignUp2.class));
            }
        });

        //функция перехода на главный экран приложения для Login кнопки
        Button loginButton = findViewById(R.id.LogInButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, MainActivity.class));
            }
        });

        //функция перехода на экрна регистрации в SignUp тексте
        TextView signupButton = findViewById(R.id.textSignup);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, SignUp1.class));
            }
        });
    }
    //реализация кнопки "обратно"
    public void onBackButtonClicked(View view) {
        onBackPressed();
    }
}