package com.example.android.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = findViewById(R.id.name);
        name.setText("Chrisey Hillgen");
        name.setTextSize(24);
        name.setTextColor(Color.BLUE);
        TextView birthday = findViewById(R.id.birthday);
        birthday.setText("3/1980");
        birthday.setTextSize(16);
        birthday.setTextColor(Color.BLACK);
        TextView country = findViewById(R.id.country);
        country.setText("United States");
        country.setTextSize(16);
        country.setTextColor(Color.BLACK);
        ImageView picture = findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.picture);
        

    }

}
