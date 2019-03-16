package vadeworks.agoramobile.CreateElections;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vadeworks.agoramobile.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Phase1 extends Fragment {


    public Phase1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_phase1, container, false);

        return view;
    }

}
