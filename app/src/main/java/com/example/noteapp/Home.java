package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
RecyclerView noteRv;
ImageView add , search;
TextView text;
EditText editText;
Context context;
private List<ModelClass> modelClassList = new ArrayList<>();
private AdapterClass adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        noteRv = findViewById(R.id.person_rv);
        add = findViewById(R.id.add_iv);
        search = findViewById(R.id.search_iv);
        text = findViewById(R.id.text_tv);
        editText = findViewById(R.id.serach_et);

        adapter = new AdapterClass(modelClassList);
        ModelClass modelClass1 = new ModelClass("Studing",R.drawable.ic_baseline_delete_24);
        ModelClass modelClass2 = new ModelClass("Playing",R.drawable.ic_baseline_delete_24);
        ModelClass modelClass3 = new ModelClass("Eating",R.drawable.ic_baseline_delete_24);
        ModelClass modelClass4 = new ModelClass("Sleeping",R.drawable.ic_baseline_delete_24);
        ModelClass modelClass5 = new ModelClass("talking",R.drawable.ic_baseline_delete_24);
        modelClassList.add(modelClass1);
        modelClassList.add(modelClass2);
        modelClassList.add(modelClass3);
        modelClassList.add(modelClass4);
        modelClassList.add(modelClass5);
        modelClassList.add(modelClass1);
        modelClassList.add(modelClass2);
        modelClassList.add(modelClass3);
        modelClassList.add(modelClass4);
        modelClassList.add(modelClass5);
        modelClassList.add(modelClass1);
        modelClassList.add(modelClass2);
        modelClassList.add(modelClass3);
        modelClassList.add(modelClass1);
        modelClassList.add(modelClass2);
        modelClassList.add(modelClass3);
        modelClassList.add(modelClass4);
        modelClassList.add(modelClass5);
        modelClassList.add(modelClass1);
        modelClassList.add(modelClass2);
        modelClassList.add(modelClass3);
        modelClassList.add(modelClass4);
        modelClassList.add(modelClass5);
        LinearLayoutManager layoutManeger = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL,false);
        noteRv.setLayoutManager(layoutManeger);
        noteRv.addItemDecoration(new DividerItemDecoration(this,layoutManeger.getOrientation()));
        noteRv.setAdapter(adapter);

    }
}