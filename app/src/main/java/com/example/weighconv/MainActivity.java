package com.example.weighconv;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextValue;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValue = findViewById(R.id.editTextValue);
        textViewResult = findViewById(R.id.textViewResult);

        Button buttonConvertMeterToKm = findViewById(R.id.buttonConvertMeterToKm);
        Button buttonConvertPoundToKg = findViewById(R.id.buttonConvertPoundToKg);
        Button buttonConvertFeetToFoot = findViewById(R.id.buttonConvertFeetToFoot);
        Button buttonConvertYardToSqFoot = findViewById(R.id.buttonConvertYardToSqFoot);

        buttonConvertMeterToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String conversionType = "meter_to_kilometer";
                double inputValue = Double.parseDouble(editTextValue.getText().toString());
                calculateConversion(inputValue, conversionType);
            }
        });

        buttonConvertPoundToKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String conversionType = "pound_to_kg";
                double inputValue = Double.parseDouble(editTextValue.getText().toString());
                calculateConversion(inputValue, conversionType);
            }
        });

        buttonConvertFeetToFoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String conversionType = "feet_to_foot";
                double inputValue = Double.parseDouble(editTextValue.getText().toString());
                calculateConversion(inputValue, conversionType);
            }
        });

        buttonConvertYardToSqFoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String conversionType = "yard_to_square_foot";
                double inputValue = Double.parseDouble(editTextValue.getText().toString());
                calculateConversion(inputValue, conversionType);
            }
        });
    }

    private void calculateConversion(double inputValue, String conversionType) {
        double result = 0.0;
        if (conversionType.equals("meter_to_kilometer")) {
            result = inputValue / 1000;
        } else if (conversionType.equals("pound_to_kg")) {
            result = inputValue * 0.453592;
        } else if (conversionType.equals("feet_to_foot")) {
            result = inputValue / 0.3048;
        } else if (conversionType.equals("yard_to_square_foot")) {
            result = inputValue * 9;
        }
        textViewResult.setText("Result: " + result);
    }
}