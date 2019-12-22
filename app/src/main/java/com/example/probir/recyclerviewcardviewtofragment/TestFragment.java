package com.example.probir.recyclerviewcardviewtofragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.probir.recyclerviewcardviewtofragment.SettingsFragment;

/**
 * Created by mbiplobe on 7/29/2016.
 */
public class TestFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, container, false);
        if (savedInstanceState==null){
            getFragmentManager().beginTransaction().add(R.id.frame, new SettingsFragment()).commit();
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
