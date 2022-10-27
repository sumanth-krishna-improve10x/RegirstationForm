package com.example.registrationformactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
            String dateOfBirth = dateOfBirthTxt.getText().toString();
            EditText placeOfBirthTxt = findViewById(R.id.place_of_birth_txt);
            String placeOfBirth = placeOfBirthTxt.getText().toString();
            Intent birthDetailsIntent = new Intent(this, ProfessionalInfoActivity.class);
            birthDetailsIntent.putExtras(bundle);
            birthDetailsIntent.putExtra("dateOfBirth", dateOfBirth);
            birthDetailsIntent.putExtra("placeOfBirth", placeOfBirth);
            startActivity(birthDetailsIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}