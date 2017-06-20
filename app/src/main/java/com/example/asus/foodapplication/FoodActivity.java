package com.example.asus.foodapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView list = getListView();
        ArrayAdapter <FoodClass>  adapter= new ArrayAdapter<FoodClass>(this,android.R.layout.simple_list_item_1,FoodClass.foods);
        list.setAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent in =new Intent(FoodActivity.this,PlateActivity.class);
        in.putExtra("id",(int) id);
        startActivity(in);
    }
}
