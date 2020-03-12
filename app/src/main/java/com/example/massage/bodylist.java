package com.example.massage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class bodylist extends AppCompatActivity {

    List<body> bodyList = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    RecylerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodylist);

        initial();

        recyclerView =(RecyclerView)findViewById(R.id.bodyrecyler);
        adapter = new RecylerViewAdapter(bodyList,getBaseContext());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initial() {
    bodyList.add(new body(R.drawable.c03_1,"腸胃問題"));
    bodyList.add(new body(R.drawable.c03_2,"失眠問題"));
    bodyList.add(new body(R.drawable.c03_3,"肝臟問題"));
    bodyList.add(new body(R.drawable.c03_5,"胰臟問題"));
    bodyList.add(new body(R.drawable.c03_7,"頭痛問題"));
    bodyList.add(new body(R.drawable.c03_8,"眼睛問題"));
    bodyList.add(new body(R.drawable.c03_9,"失眠問題"));
    bodyList.add(new body(R.drawable.c03_10,"精神問題"));
    bodyList.add(new body(R.drawable.c03_14,"耳朵問題"));

    }
}
