package com.example.probir.recyclerviewcardviewtofragment;


import android.app.ActionBar;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.Stack;


/**
 * A simple {@link Fragment} subclass.
 */
public class FourFragment extends Fragment {

    View rootview;
    TextView text_one;
    public FourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_four, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("প্রথম ফ্রাগমেন্ট");
        //((AppCompatActivity)getActivity()).getSupportActionBar().setIcon(R.drawable.ic_twitter);
        //((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);
        //((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //((AppCompatActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);

        ((TextView) rootview.findViewById(R.id.text_one)).setText(getResources().getString(R.string.large_text));
        this.text_one = (TextView) rootview.findViewById(R.id.text_one);
        this.text_one.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "SolaimanLipi.ttf"));
        return rootview;
    }


}
