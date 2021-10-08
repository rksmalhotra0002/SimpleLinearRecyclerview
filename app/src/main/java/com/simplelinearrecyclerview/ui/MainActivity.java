package com.simplelinearrecyclerview.ui;

import androidx.annotation.ArrayRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.simplelinearrecyclerview.R;
import com.simplelinearrecyclerview.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

private RecyclerView recycklerview_java;

private List<Integer>listimage;

private List<String>listtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();

        setListForRecyclerView();

        setAdapterForRecyclerView();

    }

    private void initializeViews()
    {
        recycklerview_java=findViewById(R.id.recycklerview_java);

    }

    private void setListForRecyclerView()
    {
        listtitle=new ArrayList<>();

        listimage=new ArrayList<>();

        listimage.add(R.drawable.rate);

        listimage.add(R.drawable.iconsandroid);

        listimage.add(R.drawable.privacypolicy);

        listimage.add(R.drawable.privacypolicy);

        listimage.add(R.drawable.termsandconditions);

        listimage.add(R.drawable.termsandconditions);

        listtitle.add("Rate");

        listtitle.add("Shubham");

        listtitle.add("Arjun");

        listtitle.add("Arjun");

        listtitle.add("Terms And Conditions");

        listtitle.add("Terms And Conditions");
    }

    private void setAdapterForRecyclerView()
    {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycklerview_java.setHasFixedSize(true);
        recycklerview_java.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,listimage,listtitle);
        recycklerview_java.setAdapter(adapter);

    }
}