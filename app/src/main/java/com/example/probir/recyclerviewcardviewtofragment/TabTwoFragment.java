package com.example.probir.recyclerviewcardviewtofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Stack;

public class TabTwoFragment extends Fragment {

    private ItemAdapter adapter;
    private ItemModel itemModel;
    private ArrayList<ItemModel> itemlist;
    private RecyclerView recyclerView;



    public TabTwoFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_two, container, false);
        this.recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(1);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.itemlist = new ArrayList();
        this.itemlist.add(new ItemModel("প্রথম ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("দ্বিতীয় ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("তৃতীয় ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("চতুর্থ ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("পঞ্চম ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("ষষ্ঠ ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("সপ্তম ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("অষ্টম ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("নবম ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("দশম ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("একাদশ ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("দ্বাদশ ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("ত্রয়োদশ ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("চর্তুদশ ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("পঞ্চদশ ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("ষষ্ঠদশ ফ্রাগমেন্ট"));
        this.itemlist.add(new ItemModel("সপ্তদশ ফ্রাগমেন্ট"));
        this.adapter = new ItemAdapter(getActivity(), this.itemlist);
        this.recyclerView.setAdapter(this.adapter);
        return view;
        }

}
