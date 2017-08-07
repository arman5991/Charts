package com.example.arman.charts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.RadarChart;

public class RadarFragment extends Fragment {

    public RadarFragment() {
    }

    public static RadarFragment newInstance() {
        return new RadarFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_radar, container, false);
        RadarChart mChart = (RadarChart) rootView.findViewById(R.id.rada_chart);

        return rootView;
    }
}
