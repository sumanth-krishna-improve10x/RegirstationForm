package com.example.registrationformactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText panNumberTxt = findViewById(R.id.pan_number_txt);
            String panNumber = panNumberTxt.getText().toString();
            EditText aadharNumberTxt = findViewById(R.id.aadhar_txt);
            String aadharNumber = aadharNumberTxt.getText().toString();
            Intent identityIntent = new Intent(this, SuccessActivity.class);
            identityIntent.putExtras(bundle);
            identityIntent.putExtra("panNumber", panNumber);
            identityIntent.putExtra("aadharNumber", aadharNumber);
            startActivity(identityIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}