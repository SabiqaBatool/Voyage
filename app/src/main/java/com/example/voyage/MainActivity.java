package com.example.voyage;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createAccount(View view)
    {
        Intent myIntent = new Intent(getBaseContext(), signup.class);
        startActivity(myIntent);
    }


    /**
     * @param view
     */
    public void change(View view)
    {
        Intent myIntent = new Intent(getBaseContext(), resestPassword.class);
        startActivity(myIntent);
    }


    public void signin(View view)
    {
        Intent myIntent = new Intent(getBaseContext(), navigation.class);
        startActivity(myIntent);
    }


}
