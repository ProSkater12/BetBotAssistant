package com.example.bekov.betbotassistant.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bekov.betbotassistant.R;

import androidx.fragment.app.Fragment;

public class ControlPanelFragment extends Fragment {

    public ControlPanelFragment() {
    }

    public static ControlPanelFragment newInstance() {
        return new ControlPanelFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_control_panel, container, false);
    }
}
