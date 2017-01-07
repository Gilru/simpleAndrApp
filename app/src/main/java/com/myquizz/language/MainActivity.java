package com.myquizz.language;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpClickHandler();
    }


    public void setUpClickHandler() {
        final LinearLayout numbers = (LinearLayout) findViewById(R.id.numbers);
        final LinearLayout members = (LinearLayout) findViewById(R.id.members);
        final LinearLayout colors = (LinearLayout) findViewById(R.id.colors);
        final LinearLayout phrases = (LinearLayout) findViewById(R.id.phrases);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TODO numbers activity
                  openActivity(Numbers.class);
            }
        });
        members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TODO numbers activity
                  openActivity(Members.class);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TODO numbers activity
                openActivity(Colors.class);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TODO numbers activity
                  openActivity(Phrases.class);
            }
        });
    }

    public void openActivity( Class<?> cls) {
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
    }
}
