package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView answer;
    EditText editTxt1;
    EditText editTxt2;
    Button add_btn, subtract_btn, multiply_btn, divide_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTxt1 = (EditText) findViewById(R.id.editText_number1_activity2);
        editTxt2 = (EditText) findViewById(R.id.editText_number2_activity2);
        answer = (TextView) findViewById(R.id.textView_answer);
        add_btn = (Button) findViewById(R.id.add_button);
        subtract_btn = (Button) findViewById(R.id.subtract_button);
        multiply_btn = (Button) findViewById(R.id.multiply_button);
        divide_btn = (Button) findViewById(R.id.divide_button);


        int n1 = getIntent().getIntExtra("nm1", 0);
        int n2 = getIntent().getIntExtra("nm2", 0);


        editTxt1.setText(String.valueOf(n1));
        editTxt2.setText(String.valueOf(n2));


        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int final_answer;

                int number1 = Integer.parseInt(editTxt1.getText().toString());
                int number2 = Integer.parseInt(editTxt2.getText().toString());

                final_answer = number1 + number2;

                answer.setText(String.valueOf(number1)+" + "+String.valueOf(number2)+" = "+String.valueOf(final_answer));

            }
        });

        subtract_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int final_answer;

                int number1 = Integer.parseInt(editTxt1.getText().toString());
                int number2 = Integer.parseInt(editTxt2.getText().toString());

                final_answer = number1 - number2;

                answer.setText(String.valueOf(number1)+" - "+String.valueOf(number2)+" = "+String.valueOf(final_answer));

            }
        });


        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int final_answer;

                int number1 = Integer.parseInt(editTxt1.getText().toString());
                int number2 = Integer.parseInt(editTxt2.getText().toString());

                final_answer = number1 * number2;

                answer.setText(String.valueOf(number1)+" * "+String.valueOf(number2)+" = "+String.valueOf(final_answer));

            }
        });


        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float final_answer;

                int number1 = Integer.parseInt(editTxt1.getText().toString());
                int number2 = Integer.parseInt(editTxt2.getText().toString());

                final_answer = (float) number1 / number2;

                answer.setText(String.valueOf(number1)+" / "+String.valueOf(number2)+" = "+String.valueOf(final_answer));

            }
        });


    }
}