package com.example.unitconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variables objects same as in java
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextNumberDecimal);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Thanks for using this app bhai", Toast.LENGTH_SHORT).show();

                String s =editText.getText().toString();
                if(s.length()==0)
                    textView.setText("Enter something bhai");
                else{
                    int celcius=Integer.parseInt(s);
                    int kelvin=celcius+273;
                    textView.setText(celcius+" celcius is equal to "+kelvin+" kelvin");
                }
            }
        });


    }
}