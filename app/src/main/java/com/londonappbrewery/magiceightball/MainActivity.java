package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button click = findViewById(R.id.click);

        final ImageView ball = findViewById(R.id.img_magic_view);

        final int [] ball_PIC = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ball.setImageResource(ball_PIC[generateRandom(4)]);
                Log.d("hola","test 1");

            }
        });


    }


    public int generateRandom (int bound)
    {
        int num;

        Random ran = new Random();
         num = ran.nextInt(bound);
        return num;

    }

}
