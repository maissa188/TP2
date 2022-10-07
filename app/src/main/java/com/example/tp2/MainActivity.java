package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
Button btn;
TextView txt;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn = (Button)findViewById(R.id.b1);
        txt=(TextView) findViewById(R.id.t1);
        b=(Button) findViewById(R.id.b2);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Showme();
           }
       });


      b.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i2= new Intent(MainActivity.this,ThirdActivity.class);
              startActivity(i2);

          }
      });


    }
    public void Showme(){
        Intent i= new Intent(MainActivity.this,SecondActivity.class);
        startActivity(i);
    }
}