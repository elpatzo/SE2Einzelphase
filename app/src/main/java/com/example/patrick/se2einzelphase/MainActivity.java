package com.example.patrick.se2einzelphase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public void checkPalindrom(View view){
        EditText edit = (EditText) findViewById(R.id.txtEnter);
        TextView result = (TextView) findViewById(R.id.txtResult);
        String pal = edit.getText().toString();

        if (pal.length() == 0){
            result.setText("Kein String eingegeben");
        }
        else if (pal.length() <5){
            result.setText("String zu kurz");
        }
        else{
            if(isPalindrome(pal)){
                result.setText("ist Palindrom");
            }
            else {
                result.setText("kein Palindrom");
            }
        }
    }


    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
