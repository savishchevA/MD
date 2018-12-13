package com.example.mokoma.lab3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(this, "On Config Change: Landscape", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "On Config Change: Portrait", Toast.LENGTH_SHORT).show();
        }
        super.onConfigurationChanged(newConfig);
    }
}
