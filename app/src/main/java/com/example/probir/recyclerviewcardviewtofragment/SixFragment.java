package com.example.probir.recyclerviewcardviewtofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SixFragment extends Fragment {

View rootview;
    public SixFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_six, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("তৃতীয় ফ্রাগমেন্ট");
        return rootview;
    }

}
