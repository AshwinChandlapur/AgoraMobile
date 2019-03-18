package vadeworks.agoramobile.CreateElections;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import vadeworks.agoramobile.MainActivity;
import vadeworks.agoramobile.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Phase5 extends Fragment {


    public Phase5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_phase5, container, false);

        FloatingActionButton next5 = view.findViewById(R.id.forwardCard5);
        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.realtimeResults:
                if (checked){

                }else{

                }
                break;
            case R.id.inviteVoters:
                if (checked){

                }else{

                }
                break;
        }
    }

    public void q1onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q1option1:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.q1option2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.q1option3:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void q2onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q2option1:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.q1option2:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

}
