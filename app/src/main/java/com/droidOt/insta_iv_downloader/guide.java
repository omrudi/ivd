package com.droidOt.insta_iv_downloader;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class guide extends Fragment {

    // variable to track event time

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState){

        View rootView = inflater.inflate(R.layout.guide, container, false);

        return rootView;

    }


    @Override
    public void onResume() {

        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }


}