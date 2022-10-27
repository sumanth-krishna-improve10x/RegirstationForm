package com.example.registrationformactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_info);
        Button button = findViewById(R.id.Next_btn);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, PersonalInfoActivity.class);
            EditText emailAddressTxt = findViewById(R.id.email_address_txt);
            String emailAddress = emailAddressTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.Password_txt);
            String password = passwordTxt.getText().toString();
            EditText confirmPasswordTxt = findViewById(R.id.Confirm_password_txt);
            String confirmPassword = confirmPasswordTxt.getText().toString();
           // Toast.makeText(this, emailAddress + "\t" + password + "\t" + confirmPassword, Toast.LENGTH_SHORT).show();
            intent.putExtra("emailAddress", emailAddress);
            intent.putExtra("password", password);
            intent.putExtra("confirmPassword", confirmPassword);
            startActivity(intent);
        });
    }
}