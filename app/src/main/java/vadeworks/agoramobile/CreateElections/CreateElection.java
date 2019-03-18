package vadeworks.agoramobile.CreateElections;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.badoualy.stepperindicator.StepperIndicator;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;

import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import vadeworks.agoramobile.MainScreenFragments.FragmentAdapter_HomePage;
import vadeworks.agoramobile.R;

import static vadeworks.agoramobile.CreateElections.Phase1.electionNameString;


public class CreateElection extends AppCompatActivity implements DatePickerDialog.OnDateSetListener,
        TimePickerDialog.OnTimeSetListener {


    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_election);

        StepperIndicator indicator = findViewById(R.id.indicator);
        viewpager = findViewById(R.id.viewpagerElection);
        FragmentAdapter_CreateElections pagerAdapter = new FragmentAdapter_CreateElections(getSupportFragmentManager());
        viewpager.setAdapter(pagerAdapter);


        Toast.makeText(getApplicationContext(),"<<<<<<<<Swipe for further steps",Toast.LENGTH_SHORT).show();

        // Disables Scroll Function for ViewPager
//        viewpager.setOnTouchListener(new View.OnTouchListener() {
//
//            public boolean onTouch(View arg0, MotionEvent arg1) {
//                return true;
//            }
//        });

        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                if(position == 0) {
//                    if(electionNameString.trim().length() == 0) {
//                        viewpager.setCurrentItem(0);
//                    }
//                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        indicator.setViewPager(viewpager);
        indicator.setViewPager(viewpager, viewpager.getAdapter().getCount() - 1); //


//        LinearLayout l1 = findViewById(R.id.l1);
//        LinearLayout l2 = findViewById(R.id.l2);
//        LinearLayout l3 = findViewById(R.id.l3);
//        LinearLayout l4 = findViewById(R.id.l4);
//        LinearLayout l5 = findViewById(R.id.l5);
//        l1.setVisibility(View.VISIBLE);
//        l2.setVisibility(View.GONE);
//        l3.setVisibility(View.GONE);
//        l4.setVisibility(View.GONE);
//        l5.setVisibility(View.GONE);

        //Card1 -> Store Election Name and Description
//        FloatingActionButton next1 = findViewById(R.id.forwardCard1);
//        next1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                l1.setVisibility(View.GONE);
//                l2.setVisibility(View.VISIBLE);
//            }
//        });



        //Card2-> Store StartDate and EndDate

//        FloatingActionButton next2 = findViewById(R.id.forwardCard2);
//        next2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                l2.setVisibility(View.GONE);
//                l3.setVisibility(View.VISIBLE);
//            }
//        });

//        FloatingActionButton back2 = findViewById(R.id.backwardCard2);
//        back2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                l2.setVisibility(View.GONE);
//                l1.setVisibility(View.VISIBLE);
//            }
//        });

//        Button button = findViewById(R.id.pickStartDate);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Calendar now = Calendar.getInstance();
//                DatePickerDialog dpd = DatePickerDialog.newInstance(
//                        CreateElection.this,
//                        now.get(Calendar.YEAR), // Initial year selection
//                        now.get(Calendar.MONTH), // Initial month selection
//                        now.get(Calendar.DAY_OF_MONTH) // Inital day selection
//                );
//
//
//                dpd.show(getSupportFragmentManager(), "Datepickerdialog");
//            }
//        });


        //Card3 -> Should be able to add candidates andStore Candidate Names

//        FloatingActionButton next3 = findViewById(R.id.forwardCard3);
//        next3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                l3.setVisibility(View.GONE);
//                l4.setVisibility(View.VISIBLE);
//            }
//        });

//        FloatingActionButton back3 = findViewById(R.id.backwardCard3);
//        back3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                l3.setVisibility(View.GONE);
//                l2.setVisibility(View.VISIBLE);
//            }
//        });

//        ArrayList<String> mobileArray = new ArrayList<>();
//        mobileArray.add("Android");
//        mobileArray.add("Iphone");
//
//        ArrayAdapter adapter = new ArrayAdapter<String>(this,
//                R.layout.activity_listview, mobileArray);
//
//        ListView listView = (ListView) findViewById(R.id.candidate_list);
//        listView.setAdapter(adapter);
//
//
//        Button addCandidate = findViewById(R.id.addCandidate);
//        addCandidate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mobileArray.add("BlueBerry");
//                adapter.notifyDataSetChanged();
//            }
//        });


        //Card4 - User will Select Voting Algorithm


//        FloatingActionButton next4 = findViewById(R.id.forwardCard4);
//        next4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                l4.setVisibility(View.GONE);
//                l5.setVisibility(View.VISIBLE);
//            }
//        });

//        FloatingActionButton back4 = findViewById(R.id.backwardCard4);
//        back4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                l4.setVisibility(View.GONE);
//                l3.setVisibility(View.VISIBLE);
//            }
//        });

//        ArrayList<String> votingAlgorithms = new ArrayList<>();
//        votingAlgorithms.add("Oklahoma");
//        votingAlgorithms.add("Range Voting");
//        votingAlgorithms.add("RankedPairs");
//        votingAlgorithms.add("Satisfaction Approval Voting");
//        votingAlgorithms.add("Sequential Propotional Approval Voting");
//        votingAlgorithms.add("SmithSet");
//        votingAlgorithms.add("Approval");
//        votingAlgorithms.add("Exhaustive Ballot");
//        votingAlgorithms.add("Baldwin");
//        votingAlgorithms.add("Exhaustive Ballot with Dropoff");
//        votingAlgorithms.add("Uncovered Set");
//        votingAlgorithms.add("CopeLand");
//        votingAlgorithms.add("Minimax Condorset");
//        votingAlgorithms.add("Random Ballot");
//        votingAlgorithms.add("Borda");
//        votingAlgorithms.add("Kemeny Young");
//        votingAlgorithms.add("Nanson");
//        votingAlgorithms.add("Instant Runoff 2-Round");
//        votingAlgorithms.add("Contingent Method");
//
//        ArrayAdapter adapterforAlgorithm = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_single_choice, votingAlgorithms);
//
//        ListView listViewforAlgorithm = (ListView) findViewById(R.id.votingAlgorithm);
//        listViewforAlgorithm.setAdapter(adapterforAlgorithm);



        //Card 5

//        FloatingActionButton next5 = findViewById(R.id.forwardCard5);
//        next5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//        FloatingActionButton back5 = findViewById(R.id.backwardCard5);
//        back5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                l5.setVisibility(View.GONE);
//                l4.setVisibility(View.VISIBLE);
//            }
//        });
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String date = "You picked the following date: "+dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
        Toast.makeText(getApplicationContext(),date,Toast.LENGTH_SHORT).show();
        Calendar now = Calendar.getInstance();
        TimePickerDialog dpd = TimePickerDialog.newInstance(
                CreateElection.this,
                now.get(Calendar.HOUR), // Initial year selection
                now.get(Calendar.MINUTE),
                false
        );
        dpd.show(getSupportFragmentManager(), "Datepickerdialog");


//        dateTextView.setText(date);
    }

    @Override
    public void onTimeSet(TimePickerDialog view, int hourOfDay, int minute, int second) {
        String date = "You picked the following time: "+hourOfDay+"/"+(minute+1)+"/"+second;
        Toast.makeText(getApplicationContext(),date,Toast.LENGTH_SHORT).show();
    }


//
//    public void onCheckboxClicked(View view) {
//        // Is the view now checked?
//        boolean checked = ((CheckBox) view).isChecked();
//
//        // Check which checkbox was clicked
//        switch(view.getId()) {
//            case R.id.realtimeResults:
//                if (checked){
//
//                }else{
//
//                }
//                break;
//            case R.id.inviteVoters:
//                if (checked){
//
//                }else{
//
//                }
//                break;
//            // TODO: Veggie sandwich
//        }
//    }

//    public void q1onRadioButtonClicked(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.q1option1:
//                if (checked)
//                    // Pirates are the best
//                    break;
//            case R.id.q1option2:
//                if (checked)
//                    // Ninjas rule
//                    break;
//            case R.id.q1option3:
//                if (checked)
//                    // Ninjas rule
//                    break;
//        }
//    }

//    public void q2onRadioButtonClicked(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.q2option1:
//                if (checked)
//                    // Pirates are the best
//                    break;
//            case R.id.q1option2:
//                if (checked)
//                    // Ninjas rule
//                    break;
//        }
//    }
}
