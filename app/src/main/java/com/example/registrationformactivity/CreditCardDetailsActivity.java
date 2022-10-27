package com.example.registrationformactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            EditText cardNumberTxt = findViewById(R.id.card_number_txt);
            String cardNumber = cardNumberTxt.getText().toString();
            EditText cardHolderTxt = findViewById(R.id.card_holder_txt);
            String cardHolder = cardHolderTxt.getText().toString();
            EditText expiryDateTxt = findViewById(R.id.expiry_date_txt);
            String expiryDate = expiryDateTxt.getText().toString();
            EditText cvvTxt = findViewById(R.id.cvv_txt);
            String cvv = cvvTxt.getText().toString();
            Intent creditCardDetailsIntent = new Intent(this, IdentityActivity.class);
            creditCardDetailsIntent.putExtras(bundle);
            creditCardDetailsIntent.putExtra("cardNumber" , cardNumber);
            creditCardDetailsIntent.putExtra("cardHolder" , cardHolder);
            creditCardDetailsIntent.putExtra("expiryDate" , expiryDate);
            creditCardDetailsIntent.putExtra("cvv" , cvv);
            startActivity(creditCardDetailsIntent);
        });

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}