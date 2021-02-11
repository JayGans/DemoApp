package com.ganesh.demoapp.Adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.ganesh.demoapp.R;

import java.util.ArrayList;
import java.util.List;

public class Trans_Adapter extends  RecyclerView.Adapter<Trans_Adapter.MyViewHolder> {

private List<String> moviesList;

public class MyViewHolder extends RecyclerView.ViewHolder {


    public MyViewHolder(View view) {
        super(view);


    }
}


    public Trans_Adapter(List<String> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tran_adapter, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {




    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}




