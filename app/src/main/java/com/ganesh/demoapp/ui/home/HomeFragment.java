package com.ganesh.demoapp.ui.home;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ganesh.demoapp.R;
import com.hadiidbouk.charts.BarData;
import com.hadiidbouk.charts.ChartProgressBar;

import java.util.ArrayList;
import java.util.List;
import com.ganesh.demoapp.Adapter.*;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ChartProgressBar mChart;
    RecyclerView list;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        ArrayList<BarData> dataList = new ArrayList<>();

        BarData data = new BarData("JAN", 8f, "₹ 44,84,145.00");
        dataList.add(data);

        data = new BarData("FEB", 2.8f, "₹ 14,74,845.00");
        dataList.add(data);

        data = new BarData("MAR", 0f, "₹ 0");
        dataList.add(data);

        data = new BarData("APR", 0f, "₹ 0");
        dataList.add(data);

        data = new BarData("MAY", 0f, "₹ 0");
        dataList.add(data);

        data = new BarData("JUN", 0f, "₹ 0");
        dataList.add(data);
        data = new BarData("JUL", 0f, "₹ 0");
        dataList.add(data);
        data = new BarData("AUG", 0f, "₹ 0");
        dataList.add(data);


        mChart = (ChartProgressBar) root.findViewById(R.id.ChartProgressBar);

        mChart.setDataList(dataList);
        mChart.build();

        list=(RecyclerView)root.findViewById(R.id.list_trans);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(getActivity());
        list.setLayoutManager(mLayoutManager1);
        list.setNestedScrollingEnabled(true);

        ArrayList<String> moviesList =new ArrayList<>();
        for (int i=0;i<10;i++)
                moviesList.add("hi");


        list.setAdapter(new Trans_Adapter(moviesList));

        TextView txtm=(TextView)root.findViewById(R.id.thism);
        TextView txtpre=(TextView)root.findViewById(R.id.prem);

        txtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtm.setTextColor(Color.parseColor("#2fc8e9"));
                txtpre.setTextColor(Color.parseColor("#7B8081"));
                txtm.setBackground(getResources().getDrawable(R.drawable.bottom_line_color));
                txtpre.setBackground(getResources().getDrawable(R.drawable.bottom_line_gray));
                txtm.setTypeface(txtm.getTypeface(), Typeface.BOLD);
                txtpre.setTypeface(txtpre.getTypeface(), Typeface.NORMAL);
            }
        });
        txtpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtpre.setTextColor(Color.parseColor("#2fc8e9"));
                txtm.setTextColor(Color.parseColor("#7B8081"));
                txtpre.setBackground(getResources().getDrawable(R.drawable.bottom_line_color));
                txtm.setBackground(getResources().getDrawable(R.drawable.bottom_line_gray));
                txtm.setTypeface(txtm.getTypeface(), Typeface.NORMAL);
                txtpre.setTypeface(txtpre.getTypeface(), Typeface.BOLD);
            }
        });



        return root;
    }
}