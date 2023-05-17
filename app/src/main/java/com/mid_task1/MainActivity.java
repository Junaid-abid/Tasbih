package com.mid_task1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,rest;
    Button count;

    TextView t1,t2;

int count1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        rest=findViewById(R.id.button6);
        count=findViewById(R.id.count);
        t1=findViewById(R.id.Textview);
        t2=findViewById(R.id.Textview1);
        AlertDialog.Builder back = new AlertDialog.Builder(MainActivity.this);
        count.setEnabled(false);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1=0;
                t2.setText(String.valueOf(0));


                t1.setText("Tasbeeh:"+ b1.getText());
                b1.setEnabled(false);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                count.setEnabled(true);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("Tasbeeh:"+ b2.getText());
                count1=0;
                t2.setText(String.valueOf(0));
                b2.setEnabled(false);
                b1.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                count.setEnabled(true);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("Tasbeeh:"+ b3.getText());
                count1=0;
                b3.setEnabled(false);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                count.setEnabled(true);
                t2.setText(String.valueOf(0));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.setText("Tasbeeh:"+ b4.getText());
                b4.setEnabled(false);
                b4.setFocusable(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b5.setEnabled(true);
                count.setEnabled(true);
                t2.setText(String.valueOf(0));
                count1=0;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("Tasbeeh:"+ b5.getText());
                b5.setEnabled(false);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b1.setEnabled(true);
                count.setEnabled(true);
                t2.setText(String.valueOf(0));
                count1=0;
            }
        });
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                back.setTitle("Rest")

                        .setMessage("Are you want to reset")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        t1.setText("Tasbeeh:");
                                        count.setEnabled(true);
                                        t2.setText(String.valueOf(0));
                                        count1=0;
                                        b5.setEnabled(true);
                                        b2.setEnabled(true);
                                        b3.setEnabled(true);
                                        b4.setEnabled(true);
                                        b1.setEnabled(true);
                                        count.setEnabled(false);
                                    }
                                })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Rest Cancel",Toast.LENGTH_SHORT).show();
                            }
                        }).show();




            }
        });


        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                t2.setText(String.valueOf(count1));
            }
        });







    }
}