package com.dedicatoriaaudrey.lab01;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button incrementButton;
    Button decrementButton;
    TextView counter;

    TextView painter;

    TextView message;

    MediaPlayer mediaplayer;
    MediaPlayer angry;
    boolean is_angry=false;


    int count =0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        incrementButton = findViewById(R.id.add_button);
        decrementButton = findViewById(R.id.sub_button);
        counter = findViewById(R.id.counter);

        painter = findViewById(R.id.painter);
        message = findViewById(R.id.message);

        mediaplayer = MediaPlayer.create(this, R.raw.paintertheme);


        angry=MediaPlayer.create(this, R.raw.angrypainter);



        mediaplayer.start();
        mediaplayer.setLooping(true);
        angry.start();
        angry.setLooping(true);

        mediaplayer.setVolume(1f, 1f);
        angry.setVolume(0f, 0f);

//angry.start();



        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("adding..." + ++count);
                Log.i("adding...", "" +count);
                counter.setText(""+count);
                //mediaplayer.stop();
                //angry.start();



                if(count<0){
                    counter.setTextColor(Color.RED);
                    painter.setText(":|");
                    message.setText("...");
                }
                if(count<=-10){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:|");
                    message.setText("hmmmm");
                }

                if(count<=-50){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:/");
                    message.setText("whaddya think you're doing");
                }

                if(count<=-75){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:[");
                    message.setText("don't get my nerves, pal");
                }

                if(count<=-100){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:(");
                    message.setText("stop...");
                }

                if(count<=-125){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:((");
                    message.setText("...");
                }

                if(count>-150 && is_angry){
                    //System.out.println("HUASDFUSDHFKUSADHFKUHASUFDKHAUSDHFSD");
                    mediaplayer.setVolume(1f, 1f);
                    angry.setVolume(0f, 0f);
                    is_angry=false;
                }

                if(count<=-150){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:0000");
                    message.setText("STOP ITTTTT");
                }

                if(count==0){
                    counter.setTextColor(Color.BLACK);
                    painter.setText(":)");
                }
                if(count>0){
                    counter.setTextColor(Color.GREEN);
                    painter.setText(":))");
                    message.setText("yeahhhh buddy");
                }



            }
        });

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                --count;
                System.out.println("adding..." + count);
                Log.i("adding...", "" +count);
                counter.setText(""+count);


                if(count<0){
                    counter.setTextColor(Color.RED);
                    painter.setText(":|");
                    message.setText("...");
                }
                if(count<=-10){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:|");
                    message.setText("hmmmm");
                }

                if(count<=-50){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:/");
                    message.setText("whaddya think you're doing");
                }

                if(count<=-75){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:[");
                    message.setText("don't get my nerves, pal");
                }

                if(count<=-100){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:(");
                    message.setText("stop...");
                }

                if(count<=-125){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:((");
                    message.setText("...");
                }

                if(count<=-150){
                    counter.setTextColor(Color.RED);
                    painter.setText(">:0000");
                    angry.setVolume(1f, 1f);
                    mediaplayer.setVolume(0f, 0f);
                    message.setText("STOP ITTTTT");
                    is_angry=true;

                    /*while(count>-999){
                        count--;
                        System.out.println("adding..." + count);
                        Log.i("adding...", "" +count);
                        counter.setText(""+count);
                        if(count==200){
                            message.setText("STOP CLICKINGGGGG");
                        }
                        if(count==500){
                            message.setText("AAAAAAAAAAAAAAAASJKADFAKSJHDFAAA");
                        }
                    }*/
                }

                if(count==0){
                    counter.setTextColor(Color.BLACK);
                    painter.setText(":)");
                }
                if(count>0){
                    counter.setTextColor(Color.GREEN);
                    painter.setText(":))");
                    message.setText("yeahhhh buddy");
                }





            }
        });




        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
    }
}