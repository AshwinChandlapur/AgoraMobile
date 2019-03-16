package vadeworks.agoramobile.CreateElections;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import vadeworks.agoramobile.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Phase4 extends Fragment {


    public Phase4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_phase4, container, false);

        ArrayList<String> votingAlgorithms = new ArrayList<>();
        votingAlgorithms.add("Oklahoma");
        votingAlgorithms.add("Range Voting");
        votingAlgorithms.add("RankedPairs");
        votingAlgorithms.add("Satisfaction Approval Voting");
        votingAlgorithms.add("Sequential Propotional Approval Voting");
        votingAlgorithms.add("SmithSet");
        votingAlgorithms.add("Approval");
        votingAlgorithms.add("Exhaustive Ballot");
        votingAlgorithms.add("Baldwin");
        votingAlgorithms.add("Exhaustive Ballot with Dropoff");
        votingAlgorithms.add("Uncovered Set");
        votingAlgorithms.add("CopeLand");
        votingAlgorithms.add("Minimax Condorset");
        votingAlgorithms.add("Random Ballot");
        votingAlgorithms.add("Borda");
        votingAlgorithms.add("Kemeny Young");
        votingAlgorithms.add("Nanson");
        votingAlgorithms.add("Instant Runoff 2-Round");
        votingAlgorithms.add("Contingent Method");

        ArrayAdapter adapterforAlgorithm = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_single_choice, votingAlgorithms);

        ListView listViewforAlgorithm = (ListView) view.findViewById(R.id.votingAlgorithm);
        listViewforAlgorithm.setAdapter(adapterforAlgorithm);


        return view;
    }

}
