package com.example.registrationformactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        // String emailAddress = intent.getStringExtra("emailAddress");
        // String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        Button nxtBtn = findViewById(R.id.nxt_btn);
        nxtBtn.setOnClickListener(view -> {
            EditText userNameTxt = findViewById(R.id.user_name_txt);
            String userName = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.first_name_txt);
            String firstName = firstNameTxt.getText().toString();
            EditText lastNameTxt = findViewById(R.id.last_name_txt);
            String lastName = lastNameTxt.getText().toString();
            //Toast.makeText(this, emailAddress + "\t" + "\t" + password + "\t" + confirmPassword + "\t" + userName + "\t" + firstName + "\t" + lastName, Toast.LENGTH_SHORT).show();
            Intent personalInfoIntent = new Intent(this, AddressActivity.class);
            personalInfoIntent.putExtras(bundle);
            // personalInfoIntent.putExtra("emailAddress", emailAddress);
            //personalInfoIntent.putExtra("password", password);
            //personalInfoIntent.putExtra("confirmPassword", confirmPassword);
            personalInfoIntent.putExtra("userName", userName);
            personalInfoIntent.putExtra("firstName", firstName);
            personalInfoIntent.putExtra("lastName", lastName);
            startActivity(personalInfoIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}