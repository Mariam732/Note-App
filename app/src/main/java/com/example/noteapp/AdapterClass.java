package com.example.noteapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterClass  extends RecyclerView.Adapter<AdapterClass.AdapterViewHolder> {
private List<ModelClass> modelList;

    public AdapterClass(List<ModelClass> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext()).inflate(R.layout.recycler_row,parent,false);
        AdapterViewHolder adapterViewHolder = new AdapterViewHolder(view);
        return adapterViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
     ModelClass modelClass = modelList.get(position);
    holder.name.setText(modelClass.getNameActivity());
    holder.clear.setImageResource(modelClass.getDeleteImage());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        // inflate views of row
        TextView name;
        ImageButton clear;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.activity_tv);
            clear = itemView.findViewById(R.id.delete_ib);
        }
    }
}
