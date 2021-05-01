package com.example.tourismapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView topRecyclerView, placeRecyclerView;
    private TopAdapter topAdapter;
    private PlaceAdapter placeAdapter;
    List<com.example.tourismapp.TopItem> topItemList = new ArrayList<>();
    Integer[] imageList = {R.drawable.burwood, R.drawable.burwood, R.drawable.burwood};

    List<com.example.tourismapp.PlaceItem> placeItemList = new ArrayList<>();
    Integer[] imageListForPlace = {R.drawable.burwood, R.drawable.burwood, R.drawable.burwood};
    String[] titleList = {"Title1", "Title2", "Title3"};
    String[] rentList = {"580 PW", "470 PW", "520 PW"};
    String[] bedList = {"2 Bedroom", "1 Bedroom", "3 Bedroom"};
    String[] carList = {"2 CarPark", "1 CarPark", "2 CarPark"};

    ImageView itemImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set top destination recyclerview
        topRecyclerView = findViewById(R.id.topRecyclerView);
        topAdapter = new TopAdapter(topItemList, MainActivity.this);
        topRecyclerView.setAdapter(topAdapter);
        RecyclerView.LayoutManager layoutManagerForTop = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        topRecyclerView.setLayoutManager(layoutManagerForTop);
        for (int i = 0; i < imageList.length; i++) {
            TopItem topItem = new TopItem(i, imageList[i]);
            topItemList.add(topItem);
        }
        //set place to go recyclerview
        placeRecyclerView = findViewById(R.id.placeRecyclerView);
        placeAdapter = new PlaceAdapter(placeItemList, MainActivity.this);
        placeRecyclerView.setAdapter(placeAdapter);
        RecyclerView.LayoutManager layoutManagerForPlace = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        placeRecyclerView.setLayoutManager(layoutManagerForPlace);
        for (int i = 0; i < imageListForPlace.length; i++) {
            PlaceItem placeItem = new PlaceItem(i, imageListForPlace[i], titleList[i], rentList[i]
                , bedList[i], carList[i]);
            placeItemList.add(placeItem);
        }

       /* Button fragmentButton = findViewById(R.id.fragmentButton);
        fragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new page_first_Fragment());
            }
        });*/
    }

    /*private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_tourism, fragment);
        fragmentTransaction.commit();
    }*/


}