package com.example.registrationformactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("emailAddress");
        String password = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        String userName = intent.getStringExtra("userName");
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String currentCompany = intent.getStringExtra("currentCompany");
        String totalExperience = intent.getStringExtra("totalExperience");
        String designation = intent.getStringExtra("designation");
        String bankName = intent.getStringExtra("bankName");
        String accountHolderName = intent.getStringExtra("accountHolderName");
        String accountNumber = intent.getStringExtra("accountNumber");
        String ifscCode = intent.getStringExtra("ifscCode");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        String placeOfBirth = intent.getStringExtra("placeOfBirth");
        String panNumber = intent.getStringExtra("panNumber");
        String adharNumber = intent.getStringExtra("adharNumber");
        String apartment = intent.getStringExtra("apartment");
        String street = intent.getStringExtra("street");
        String city = intent.getStringExtra("city");
        String state = intent.getStringExtra("state");
        String country = intent.getStringExtra("country");
        String cardNumber = intent.getStringExtra("cardNumber");
        String cardHolder = intent.getStringExtra("cardHolder");
        String expiryDate = intent.getStringExtra("expiryDate");
        String cvv = intent.getStringExtra("cvv");
        TextView emailIdTxt = findViewById(R.id.email_id_txt);
        emailIdTxt.setText(emailAddress);
        TextView userNameTxt = findViewById(R.id.user_name_txt);
        userNameTxt.setText(userName);
        TextView firstNameTxt = findViewById(R.id.first_name_txt);
        firstNameTxt.setText(firstName);
        TextView lastNameTxt = findViewById(R.id.last_name_txt);
        lastNameTxt.setText(lastName);
        TextView currentCompanyTxt = findViewById(R.id.current_company_txt);
        currentCompanyTxt.setText(currentCompany);
        TextView totalExperienceTxt = findViewById(R.id.total_experience_txt);
        totalExperienceTxt.setText(totalExperience);
        TextView designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText(designation);
        TextView bankNameTxt = findViewById(R.id.bank_name_txt);
        bankNameTxt.setText(bankName);
        TextView accountHolderNameTxt = findViewById(R.id.account_holder_name_txt);
        accountHolderNameTxt.setText(accountHolderName);
        TextView accountNumberTxt = findViewById(R.id.account_number_txt);
        accountNumberTxt.setText(accountNumber);
        TextView ifscCodeTxt = findViewById(R.id.ifsc_code_txt);
        ifscCodeTxt.setText(ifscCode);
        TextView dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
        dateOfBirthTxt.setText(dateOfBirth);
        TextView placeOfBirthTxt = findViewById(R.id.place_of_birth_txt);
        placeOfBirthTxt.setText(placeOfBirth);
        TextView panNumberTxt = findViewById(R.id.pan_number_txt);
        panNumberTxt.setText(panNumber);
        TextView adharNumberTxt = findViewById(R.id.adhar_number_txt);
        adharNumberTxt.setText(adharNumber);
        TextView apartmentTxt = findViewById(R.id.apartment_txt);
        apartmentTxt.setText(apartment);
        TextView streetTxt = findViewById(R.id.street_txt);
        streetTxt.setText(street);
        TextView cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText(city);
        TextView stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText(state);
        TextView countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText(country);
        TextView cardNumberTxt = findViewById(R.id.card_number_txt);
        cardNumberTxt.setText(cardNumber);
        TextView cardHolderTxt = findViewById(R.id.card_holder_txt);
        cardHolderTxt.setText(cardHolder);
        TextView expiryDateTxt = findViewById(R.id.expiry_date_txt);
        expiryDateTxt.setText(expiryDate);
        TextView cvvTxt = findViewById(R.id.cvv_txt);
        cvvTxt.setText(cvv);
        // Toast.makeText(this, emailAddress + "\t" + "\t" + password + "\t" + confirmPassword + "\t" + userName + "\t" + firstName + "\t" + lastName + "\t" + currentCompany + "\t" + totalExperience + "\t" + designation + "\t" + bankName + "\t" + accountHolderName + "\t" + accountNumber + "\t" + ifscCode, Toast.LENGTH_SHORT).show();
    }
}