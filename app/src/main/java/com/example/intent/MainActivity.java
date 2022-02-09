package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showGreetings(View view){
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Open Second Activity"))
        {
            Intent intent = new Intent (this, SecondActivity.class);
            startActivity(intent);
        }
        else if (button_text.equals("Open Third Activity"))
        {
            Intent intent = new Intent (this, ThirdActivity.class);
            startActivity(intent);
        }
    }

}