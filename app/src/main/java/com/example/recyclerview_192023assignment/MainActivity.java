package com.example.recyclerview_192023assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> contactlist=new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        contactlist.add(new Contact("Fatima Saeed","Old Friend","Hye there! Lets go for hangouts"));
        contactlist.add(new Contact("Iqra Zainab","Bestie","Bro! dont worry everything will be fine"));
        contactlist.add(new Contact("Rimsha Said","Old Friend", "Beb! checkout weather...."));
        contactlist.add(new Contact("Alveena Basharat","Bestie","Classy work damn ufffff"));
        contactlist.add(new Contact("Zubaida Jabbar","Friend","lets party guys...."));
        contactlist.add(new Contact("Shakeela Faiz","Friend","done with assignment"));
        contactlist.add(new Contact("Fatima Saeed","Old Friend","Hye there! Lets go for hangouts"));
        contactlist.add(new Contact("Iqra Zainab","Bestie","Bro! dont worry everything will be fine"));
        contactlist.add(new Contact("Rimsha Said","Old Friend", "Beb! checkout weather...."));
        contactlist.add(new Contact("Alveena Basharat","Bestie","Classy work damn ufffff"));

        recyclerViewAdapter= new RecyclerViewAdapter(MainActivity.this, contactlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}