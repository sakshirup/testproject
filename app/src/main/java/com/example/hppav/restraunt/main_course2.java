package com.example.hppav.restraunt;

/**
 * Created by HP PAV on 11-04-2017.
 */

import android.app.Fragment;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class main_course2 extends Fragment {
    private long workoutId;


//    public WorkoutDetailFragment() {
//        // Required empty public constructor
//
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.main_course4, container, false);

    }
    @Override
    public void onStart()
    {
        super.onStart();
        View v= getView();
        if(v!=null)
        {
            TextView title =(TextView) v.findViewById(R.id.textTitle);
            main_course1 w=main_course1.workouts[(int)workoutId];
            title.setText(w.getname());
            TextView desc=(TextView) v.findViewById(R.id.textDesc);
            desc.setText(w.getdesc());
            TextView price=(TextView) v.findViewById(R.id.textPrice);
            price.setText(" "+(w.getprice()));
        }
    }

    public void setWorkout(long id)
    {
        this.workoutId=id;

    }
}
