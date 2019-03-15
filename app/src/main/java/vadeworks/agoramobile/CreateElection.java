package vadeworks.agoramobile;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;


public class CreateElection extends AppCompatActivity implements DatePickerDialog.OnDateSetListener,
        TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_election);


        //Card1 -> Store Election Name and Description

        //Card2-> Store StartDate and EndDate
        Button button = findViewById(R.id.pickStartDate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                DatePickerDialog dpd = DatePickerDialog.newInstance(
                        CreateElection.this,
                        now.get(Calendar.YEAR), // Initial year selection
                        now.get(Calendar.MONTH), // Initial month selection
                        now.get(Calendar.DAY_OF_MONTH) // Inital day selection
                );


                dpd.show(getSupportFragmentManager(), "Datepickerdialog");
            }
        });


        //Card3 -> Should be able to add candidates andStore Candidate Names

        ArrayList<String> mobileArray = new ArrayList<>();
        mobileArray.add("Android");
        mobileArray.add("Iphone");

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.candidate_list);
        listView.setAdapter(adapter);


        Button addCandidate = findViewById(R.id.addCandidate);
        addCandidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mobileArray.add("BlueBerry");
                adapter.notifyDataSetChanged();
            }
        });

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
        String date = "You picked the following date: "+hourOfDay+"/"+(minute+1)+"/"+second;
        Toast.makeText(getApplicationContext(),date,Toast.LENGTH_SHORT).show();
    }
}
