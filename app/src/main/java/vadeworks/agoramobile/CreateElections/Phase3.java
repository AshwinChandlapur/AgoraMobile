package vadeworks.agoramobile.CreateElections;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import vadeworks.agoramobile.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Phase3 extends Fragment {


    public Phase3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_phase3, container, false);


        ArrayList<String> mobileArray = new ArrayList<>();
        mobileArray.add("Android");
        mobileArray.add("Iphone");

        ArrayAdapter adapter = new ArrayAdapter<String>(getContext(),
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) view.findViewById(R.id.candidate_list);
        listView.setAdapter(adapter);


        Button addCandidate = view.findViewById(R.id.addCandidate);
        addCandidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mobileArray.add("BlueBerry");
                adapter.notifyDataSetChanged();
            }
        });

        return view;
    }

}
