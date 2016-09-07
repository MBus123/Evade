package com.paulwirdmillionaer.evade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void f(View View){
        int i = 5/0;

    }
    public void setOptions(View view){
        setContentView(R.layout.options);
    }
    public void setGame(View view){
        setContentView(R.layout.game);
    }
    public void setRanks(View view){
        setContentView(R.layout.ranks);
    }
    public void setAboutUs(View view){
        setContentView(R.layout.about_us);
    }
    public void setHelp(View view){
        setContentView(R.layout.help);
    }
}
