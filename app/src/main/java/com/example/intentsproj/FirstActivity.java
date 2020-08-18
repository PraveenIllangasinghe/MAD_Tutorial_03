package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


    Button button;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        OnclickButtonListener();
    }

    public void OnclickButtonListener(){
        button = (Button)findViewById(R.id.ok_button);
        editText1 = (EditText)findViewById(R.id.editText_number1_activity1);
        editText2 = (EditText)findViewById(R.id.editText_number2_activity1);


        button.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        Context context = getApplicationContext();
                        CharSequence message = "You just clicked the OK button";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context,message,duration);
                        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

                        toast.show();

                        LayoutInflater li = getLayoutInflater();

                        View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                                findViewById(R.id.custom_toast_layout));

                        Toast custom_toast = new Toast(getApplicationContext());
                        custom_toast.setDuration(Toast.LENGTH_SHORT);
                        custom_toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                        custom_toast.setView(layout);//setting the view of custom toast layout
                        custom_toast.show();


                        //String no1 = editText1.getText().toString();
                        int num1 = Integer.parseInt(editText1.getText().toString());

                       // String no2 = editText2.getText().toString();
                        int num2 = Integer.parseInt(editText2.getText().toString());

                        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                        intent.putExtra("nm1", num1);
                        intent.putExtra("nm2", num2);

                      //  intent.putExtra("nm1", no1);
                      //  intent.putExtra("nm2", no2);
                        startActivity(intent);
                    }
                }
        );
    }



}