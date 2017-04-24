package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment {

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button tellJokeBtn = (Button) root.findViewById(R.id.tell_joke_btn);
        tellJokeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new FetchJokeTask().execute(getContext());
            }
        });

        return root;
    }

}