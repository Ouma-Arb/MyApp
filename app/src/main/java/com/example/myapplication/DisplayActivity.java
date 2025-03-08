package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);  // Ensure that the correct XML layout file is used

        // Get the data from the intent
        String nom = getIntent().getStringExtra("NOM");
        String email = getIntent().getStringExtra("EMAIL");
        String telephone = getIntent().getStringExtra("TELEPHONE");
        String adresse = getIntent().getStringExtra("ADRESSE");

        // Initialize the TextViews
        TextView nomTextView = findViewById(R.id.nom);
        TextView emailTextView = findViewById(R.id.email);
        TextView telephoneTextView = findViewById(R.id.telephone);
        TextView adresseTextView = findViewById(R.id.addresse);

        // Set the data in the TextViews
        nomTextView.setText("Nom: " + nom);
        emailTextView.setText("Email: " + email);
        telephoneTextView.setText("Telephone: " + telephone);
        adresseTextView.setText("Adresse: " + adresse);
    }
}