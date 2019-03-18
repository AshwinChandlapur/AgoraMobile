package vadeworks.agoramobile.MainScreenFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vadeworks.agoramobile.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Finished extends Fragment {


    public Finished() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_finished, container, false);

        return view;
    }

}
