package com.testing.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import com.testing.customlistview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Person> persons;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        persons = new ArrayList<>();
        persons.add(new Person("Thura Linn","thuralinnn45512@gmail.com"));
        persons.add(new Person("Thura Linn","thuralinnn45512@gmail.com"));
        persons.add(new Person("Thura Linn","thuralinnn45512@gmail.com"));
        persons.add(new Person("Thura Linn","thuralinnn45512@gmail.com"));
        persons.add(new Person("Thura Linn","thuralinnn45512@gmail.com"));

       MyAdapter myAdapter = new MyAdapter(persons,this);

       binding.cusList.setAdapter(myAdapter);


    }
}