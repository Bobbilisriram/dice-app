package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

      ImageView iv;
      Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.i1);
        b=findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r=new Random();
                int ra=r.nextInt(6)+1;
                if (ra==1){
                    iv.setImageResource(R.drawable.dice_1);
                         }
                else if (ra==2){
                    iv.setImageResource(R.drawable.dice_2);
                }
                else if (ra==3){
                    iv.setImageResource(R.drawable.dice_3);
                }
                else if (ra==4){
                    iv.setImageResource(R.drawable.dice_4);
                }
                else if (ra==5){
                    iv.setImageResource(R.drawable.dice_5);
                }
                else if (ra==6){
                    iv.setImageResource(R.drawable.dice_6);
                }
                else
                    iv.setImageResource(R.drawable.empty_dice);


            }
        });




    }

    }




