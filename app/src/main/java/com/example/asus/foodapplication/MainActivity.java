package com.example.asus.foodapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv =(ListView)findViewById(R.id.items);
        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                        if(position == 0){
                            Intent intent=new Intent(MainActivity.this,FoodActivity.class);
                            startActivity(intent);

                        }
            }
        };
        lv.setOnItemClickListener(itemClickListener);
    }
}
