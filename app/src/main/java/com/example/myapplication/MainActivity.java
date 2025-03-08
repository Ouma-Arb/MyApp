package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nomText = findViewById(R.id.nomtext);
        EditText emailText = findViewById(R.id.emailtext);
        EditText telephoneText = findViewById(R.id.telephonetext);
        EditText adresseText = findViewById(R.id.adressetext);
        Button button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = nomText.getText().toString();
                String email = emailText.getText().toString();
                String telephone = telephoneText.getText().toString();
                String adresse = adresseText.getText().toString();

                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("NOM", nom);
                intent.putExtra("EMAIL", email);
                intent.putExtra("TELEPHONE", telephone);
                intent.putExtra("ADRESSE", adresse);
                startActivity(intent);
            }
        });
    }
}