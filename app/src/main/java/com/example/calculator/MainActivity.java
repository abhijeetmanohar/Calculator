package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int num1, num2, result;
    EditText number1, number2;

    public void getNumbers(){
        number1 = (EditText) findViewById(R.id.number1);

        number2 = (EditText) findViewById(R.id.number2);
    }
    public void initViews(){
        String str = number1.getText().toString();
        num1 = Integer.parseInt(str);

        String str2 = number2.getText().toString();
        num2 = Integer.parseInt(str2);

    }
    public void addFunction(View view){
        initViews();
        result = num1 + num2;
        goToActivity2(result);
    }

    public void subFunction(View view){
        initViews();
        result = num1 - num2;
        goToActivity2(result);
    }

    public void multFunction(View view){
        initViews();
        result = num1 * num2;
        goToActivity2(result);
    }

    public void divFunction(View view){
        initViews();
        result = num1/num2;
        goToActivity2(result);
    }
    public void goToActivity2(int number){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",String.valueOf(number));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getNumbers();

    }
}
