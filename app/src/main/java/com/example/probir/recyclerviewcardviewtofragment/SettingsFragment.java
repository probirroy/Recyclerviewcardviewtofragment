package com.example.probir.recyclerviewcardviewtofragment;


import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment implements ListView.OnItemSelectedListener{

    View rootview;
    ListView list;
    String[] item= {"Fragment d","About Developer","Fragment f","Fragment g","Fragment h","Fragment d","Fragment e","Fragment f","Fragment g","Fragment h","Fragment h","Fragment e","Fragment f","Fragment g","Fragment h","Fragment h"};


    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_settings, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Settings");

        ListView lv =(ListView)rootview.findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, item);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment mfragmen=null;
                switch ((int) id) {
                    case 0: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 1: {
                        mfragmen = new AboutFragment();
                        break;
                    }
                    case 2: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 3: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 4: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 5: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 6: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 7: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 8: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 9: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 10: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 11: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 12: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 13: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    case 14: {
                        mfragmen = new FourFragment();
                        break;
                    }
                    default: {
                        mfragmen = new FourFragment();
                        break;
                    }
                }
                fragmentHandler(mfragmen);
            }
        });


        return rootview;
    }

    public void fragmentHandler(Fragment fragment){
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame, fragment).addToBackStack(null);
        ft.commit();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
