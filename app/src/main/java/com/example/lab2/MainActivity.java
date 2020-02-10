package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.util.Log.i;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText mytextField = (EditText) findViewById(R.id.mytextfield);

        String str = mytextField.getText().toString();

        //Toast.makeText(MainActivity.this, mytextField.getText().toString(), Toast.LENGTH_LONG).show();

        //Log.i("Info", "Button Pressed");

        goToActivity2(str);

    }

    public void goToActivity2 (String s){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
