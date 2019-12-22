package com.example.probir.recyclerviewcardviewtofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class SevenFragment extends Fragment {

    View rootview;
    public SevenFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_seven, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("চতুর্থ ফ্রাগমেন্ট");
        return rootview;

    }

}
