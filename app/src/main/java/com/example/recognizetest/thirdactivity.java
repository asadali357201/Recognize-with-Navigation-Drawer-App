package com.example.recognizetest;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class thirdactivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    //    listview of drawer
    ListView lv;
    SliderView sliderView;
    int []slideimg=new int[]{R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,};
    SliderAdp sliderAdp;


    int[] catimage=new int[]{R.drawable.electronics,R.drawable.gourmet,R.drawable.health,R.drawable.home,R.drawable.house,R.drawable.jewelary,R.drawable.outdoor,R.drawable.tools,R.drawable.electronics,R.drawable.gourmet,R.drawable.health,R.drawable.home,R.drawable.house,R.drawable.jewelary,R.drawable.outdoor,R.drawable.tools,};
    String[] catNmaes=new String[]{"Electronics","Gourmet","Health & Beauty","home & Leisure","Houseware","Jewelry","Outdoor Sports","Tools","Electronics","Gourmet","Health & Beauty","home & Leisure","Houseware","Jewelry","Outdoor Sports","Tools"};
    CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        getSupportActionBar().hide();
        lv=findViewById(R.id.lv);
        drawerLayout = findViewById(R.id.drawerlayout);
        toolbar = findViewById(R.id.toolbar);
        customAdapter=new CustomAdapter(getApplicationContext(),catimage,catNmaes);
        lv.setAdapter(customAdapter);
        sliderView=findViewById(R.id.sliderview);

//        setting slider view
        //initialize adapter
          sliderAdp=new SliderAdp(slideimg);
          //set adapter
        sliderView.setSliderAdapter(sliderAdp);
        //setting indicator animation
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        //setting transformation animation
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        //start auto cycle
        sliderView.startAutoCycle();


//        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
//        listview
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(getApplicationContext(),"clicked : "+catNmaes[position],Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}