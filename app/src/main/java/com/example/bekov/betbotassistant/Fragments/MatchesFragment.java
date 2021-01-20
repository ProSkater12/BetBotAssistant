package com.example.bekov.betbotassistant.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.example.bekov.betbotassistant.R;

import org.json.JSONArray;

import androidx.fragment.app.Fragment;

public class MatchesFragment extends Fragment {

    public MatchesFragment() {

    }

    public static MatchesFragment newInstance() {
        return new MatchesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        AndroidNetworking.get("https://bet-bot.ru.com/match_list")
                .setPriority(Priority.LOW)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {
                        // do anything with response
                        Toast toast = Toast.makeText(getActivity().getApplicationContext(),
                                "Пора покормить кота!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    @Override
                    public void onError(ANError error) {
                        // handle error
                        Toast toast = Toast.makeText(getActivity().getApplicationContext(),
                                "Пора задушить кота!", Toast.LENGTH_SHORT);
                        toast.show();


                    }
                });

        return inflater.inflate(R.layout.fragment_matches, container, false);
    }
}
