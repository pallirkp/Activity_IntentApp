package com.example.user.activity_intentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showIntent(View v){

        Uri loc = Uri.parse("geo:0,0?q=brooklyn%20bridge%2C%20brooklyn%2C%20ny");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, loc);
        startActivity(mapIntent);
    }
    public void makeACall(View v){
        Uri number = Uri.parse("tel:9885439903");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
    public void connectWeb(View v){
        Uri webpage = Uri.parse("http://www.vvitguntur.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
