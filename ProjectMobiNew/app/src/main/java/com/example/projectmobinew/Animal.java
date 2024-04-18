package com.example.projectmobinew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animal);

        Button buttonGuess = findViewById(R.id.buttonCheckGuess);
        EditText textGuess = findViewById(R.id.editTextGuess);
        buttonGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textGuess.getText().toString().toLowerCase().equals("racoon"))
                    startActivity(new Intent(Animal.this, AnimalGuessSuccess.class));
                else
                    startActivity(new Intent(Animal.this, AnimalGuessError.class));
            }
        });
    }
}