package com.example.android.technovit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Check_answer(View view) {

        EditText et =(EditText)findViewById(R.id.answer);

        if(et.getText().toString().equals("1503")){

            Toast toast = Toast.makeText(getApplicationContext(), "CORRECT", 5);
            toast.show();

            Intent intent = new Intent(this, RoomGame.class);
            startActivity(intent);


        }

        else{
            Toast toast = Toast.makeText(getApplicationContext(), "WRONG", 5);
            toast.show();

        }
    }
}
