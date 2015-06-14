package com.pandawarrior.org.portfolio;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Liew on 6/14/2015.
 */
public class MainFragment extends Fragment {

    Button mBtnSpotify;
    Button mBtnScores;
    Button mBtnLibrary;
    Button mBtnBigger;
    Button mBtnXyz;
    Button mBtnMyApp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mBtnSpotify = (Button) view.findViewById(R.id.button_spotify);
        mBtnScores = (Button) view.findViewById(R.id.button_score);
        mBtnLibrary = (Button) view.findViewById(R.id.button_library);
        mBtnBigger = (Button) view.findViewById(R.id.button_bigger);
        mBtnXyz = (Button) view.findViewById(R.id.button_xys);
        mBtnMyApp = (Button) view.findViewById(R.id.button_my_app);

        mBtnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastApp(getString(R.string.app_spotify));
            }
        });
        mBtnScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastApp(getString(R.string.button_scores));
            }
        });
        mBtnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastApp(getString(R.string.button_library));
            }
        });
        mBtnBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastApp(getString(R.string.button_library));
            }
        });
        mBtnXyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastApp(getString(R.string.button_xyz));
            }
        });
        mBtnMyApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastApp(getString(R.string.button_my_app));
            }
        });
        return view;
    }

    private void toastApp(String appName){
        Toast.makeText(getActivity(), "This button will launch my " + appName, Toast.LENGTH_SHORT).show();
    }
}
