package com.ganesh.demoapp.ui.dashboard;

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

import com.ganesh.demoapp.Adapter.Trans_Adapter;
import com.ganesh.demoapp.Adapter.invoice_Adapter;
import com.ganesh.demoapp.R;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {
    RecyclerView list;
    View root;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

         root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        list=(RecyclerView)root.findViewById(R.id.list_trans1);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(getActivity());
        list.setLayoutManager(mLayoutManager1);
        list.setNestedScrollingEnabled(true);

        ArrayList<String> moviesList =new ArrayList<>();
        for (int i=0;i<10;i++)
            moviesList.add("hi");


        list.setAdapter(new invoice_Adapter(moviesList,getActivity()));

        return root;
    }
}