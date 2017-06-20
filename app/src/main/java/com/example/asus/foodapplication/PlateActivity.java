package com.example.asus.foodapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PlateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plate);
        TextView tv=(TextView) findViewById(R.id.name);
        TextView tv1=(TextView) findViewById(R.id.desc);
        ImageView im=(ImageView) findViewById(R.id.image);

        int foodn = getIntent().getExtras().getInt("id");
        FoodClass food=FoodClass.foods[foodn];
        Log.i("kadhem",food.getName());
        Log.i("kilani",food.getDesc());
        String img=" "+food.getImageID();
        Log.i("kilani",img);
        tv.setText(food.getName());
        tv1.setText(food.getDesc());
        im.setImageResource(food.getImageID());


    }
}
