package com.wayne.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int n = random.nextInt(100)+1;
    int min=1;
    int max=100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bSend = (Button) findViewById(R.id.send);
    }
    public void Guess(View view){

        TextView secret = (TextView)findViewById(R.id.secret) ;
        int s =Integer.parseInt(secret.getText().toString());
        TextView info = (TextView)findViewById(R.id.info);

        EditText edNumber = (EditText)findViewById(R.id.number);
        int number =Integer.parseInt(edNumber.getText().toString());

        if(number<n){
            min = number;
            new AlertDialog.Builder(this)
                    .setMessage("請輸入"+min+"~"+max)
                    .setPositiveButton("OK",null)
                    .show();
        }else if (number>n){
            max = number;
            new AlertDialog.Builder(this)
                    .setMessage("請輸入"+min+"~"+max)
                    .setPositiveButton("OK",null)
                    .show();
        }else if (number==n){
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setPositiveButton("OK",null)
                    .show();
        }

    }
}

