package com.example.registrationformactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String emailAddress = intent.getStringExtra("emailAddress");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            EditText currentCompanyTxt = findViewById(R.id.current_company_txt);
            String currentCompany = currentCompanyTxt.getText().toString();
            EditText totalExperienceTxt = findViewById(R.id.total_experience_txt);
            String totalExperience = totalExperienceTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.designation_txt);
            String designation = designationTxt.getText().toString();
            // Toast.makeText(this, emailAddress + "\t" + "\t" + password + "\t" + confirmPassword + "\t" + userName + "\t" + firstName + "\t" + lastName + "\t" + currentCompany + "\t" + totalExperience + "\t" + designation, Toast.LENGTH_SHORT).show();
            Intent professionalInfoIntent = new Intent(this, BankAccountActivity.class);
            professionalInfoIntent.putExtras(bundle);
            // professionalInfoIntent.putExtra("emailAddress", emailAddress);
            // professionalInfoIntent.putExtra("password", password);
            // professionalInfoIntent.putExtra("confirmPassword", confirmPassword);
            // professionalInfoIntent.putExtra("userName", userName);
            //  professionalInfoIntent.putExtra("firstName", firstName);
            // professionalInfoIntent.putExtra("lastName", lastName);
            professionalInfoIntent.putExtra("currentCompany", currentCompany);
            professionalInfoIntent.putExtra("totalExperience", totalExperience);
            professionalInfoIntent.putExtra("designation", designation);
            startActivity(professionalInfoIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}