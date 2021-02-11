package com.ganesh.demoapp.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ganesh.demoapp.R;

import java.util.List;

public class invoice_Adapter extends  RecyclerView.Adapter<invoice_Adapter.MyViewHolder> {

private List<String> moviesList;
Context mcontext;
public class MyViewHolder extends RecyclerView.ViewHolder {

TextView txt;
    public MyViewHolder(View view) {
        super(view);

txt=(TextView)view.findViewById(R.id.txtpst);
    }
}


    public invoice_Adapter(List<String> moviesList,Context context) {
        this.moviesList = moviesList;
        mcontext=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.invoice_adapter, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

    if(position==1)
    {
        holder.txt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_dot_color, 0, 0, 0);
       holder.txt.setTextColor(Color.parseColor("#F6E4C9"));
       holder.txt.setText("Overdue");
        holder.txt.setBackground(mcontext.getResources().getDrawable(R.drawable.round_button_color));

    }

        if(position==5)
        {
            holder.txt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_dot_color, 0, 0, 0);
            holder.txt.setTextColor(Color.parseColor("#F6E4C9"));
            holder.txt.setText("Overdue");
            holder.txt.setBackground(mcontext.getResources().getDrawable(R.drawable.round_button_color));

        }


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}




