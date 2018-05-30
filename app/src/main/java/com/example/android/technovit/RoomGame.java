package com.example.android.technovit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class RoomGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_game);
    }

    public void display1(View view) {

        ImageView iv = (ImageView) findViewById(R.id.back);
        iv.setImageResource(R.drawable.room0);
    }

    public void display2(View view) {

        ImageView iv = (ImageView) findViewById(R.id.back);
        iv.setImageResource(R.drawable.room1);
    }

    public void display3(View view) {

        ImageView iv = (ImageView) findViewById(R.id.back);
        iv.setImageResource(R.drawable.room2);
    }

    public void correct(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "CORRECT", 5);
        toast.show();

        Intent i = new Intent(this, question3.class);
        startActivity(i);

    }

    public void wrong(View view) {

        Toast toast = Toast.makeText(getApplicationContext(), "WRONG", 1);
        toast.show();
    }

}
