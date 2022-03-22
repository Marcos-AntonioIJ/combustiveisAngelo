package com.example.combustiveis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title;
    EditText alcool;
    EditText gas;
    Button btnSubmit;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadComponents();
        submitConfig();
    }

    protected void loadComponents(){

        title = findViewById(R.id.title);
        alcool = findViewById(R.id.alcoolInput);
        gas = findViewById(R.id.gasInput);
        btnSubmit = findViewById(R.id.submit);
        result = findViewById(R.id.resultLabel);


    }

    @SuppressLint("SetTextI18n")
    protected void calcFuel(){

        double alcoolValue = Double.parseDouble(alcool.getText().toString());
        double gasValue = Double.parseDouble(gas.getText().toString());

        double percentageResult = gasValue * 0.7;


        if(alcoolValue <= percentageResult) result.setText("Alcool é a melhor opção");
        else result.setText("Gasolina é a melhor opção");

    }

    protected void submitConfig(){
        btnSubmit.setOnClickListener(v -> {

            calcFuel();

        });
    }







}