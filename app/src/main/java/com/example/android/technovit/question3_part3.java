package com.example.android.technovit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class question3_part3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3_part3);
    }

    public void prev(View v)
    {
        Intent i = new Intent(this,question3_part2.class);
        startActivity(i);
    }
}
