package com.example.projecttest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Button = (Button) findViewById(R.id.button2);
    }

    public void onClick1(View v){
        Intent intent = new Intent(getApplicationContext(), FinishActivity.class);
        startActivity(intent);
        finish();
    }
    public void onClick2(View v){
        Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
        startActivity(intent);
        finish();
    }

}
