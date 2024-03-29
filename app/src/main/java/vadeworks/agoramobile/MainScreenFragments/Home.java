package vadeworks.agoramobile.MainScreenFragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.daasuu.cat.CountAnimationTextView;
import com.loicteillard.easytabs.EasyTabs;

import androidx.viewpager.widget.ViewPager;
import ru.dimorinny.floatingtextbutton.FloatingTextButton;
import vadeworks.agoramobile.CreateElections.CreateElection;
import vadeworks.agoramobile.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {


    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        FloatingTextButton createElection = view.findViewById(R.id.createElection);
        createElection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CreateElection.class);
                startActivity(intent);
            }
        });


        EasyTabs easyTabs = view.findViewById(R.id.easytabs);
        ViewPager viewpager = view.findViewById(R.id.viewpager);
        FragmentAdapter_HomePage pagerAdapter = new FragmentAdapter_HomePage(getActivity().getSupportFragmentManager());
        viewpager.setAdapter(pagerAdapter);
//
        easyTabs.setViewPager(viewpager, 0); // Set viewPager to EasyTabs with default index
//
        easyTabs.setPagerListener(new EasyTabs.PagerListener() { // Optional, add a listener
            @Override
            public void onTabSelected(int position) {
//                Toast.makeText(getActivity(), "tab selected:"+position, Toast.LENGTH_SHORT).show();
            }
        });


        CountAnimationTextView total = view.findViewById(R.id.total);
        total.setAnimationDuration(2000).countAnimation(0, 10);
        CountAnimationTextView pending = view.findViewById(R.id.pending);
        pending.setAnimationDuration(2000).countAnimation(0, 6);
        CountAnimationTextView active = view.findViewById(R.id.active);
        active.setAnimationDuration(2000).countAnimation(0, 2);
        CountAnimationTextView finished = view.findViewById(R.id.finished);
        finished.setAnimationDuration(2000).countAnimation(0, 2);

        return view;
    }

}
