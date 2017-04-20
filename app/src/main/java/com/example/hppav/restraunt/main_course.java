package com.example.hppav.restraunt;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class main_course extends AppCompatActivity implements main_course3.WorkoutListListener{
    static float total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);

    }

    @Override
    public void itemCLicked(long id) {

        float p1=0,p2=0,p3=0,p4=0,p0=0;

        main_course2 details = new main_course2();
        FragmentTransaction ft= getFragmentManager().beginTransaction();
        details.setWorkout(id);
        //Toast.makeText(getApplicationContext(),""+id,Toast.LENGTH_SHORT).show();
        ft.replace(R.id.fragment_container,details);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

        switch ((int) id)
        {
            case 0: p0=300;
                total=p0+total;
                break;
            case 1: p1=400;
                total=p1+total;
                break;
            case 2: p2=190;
                total+=p2;
                break;
            case 3: p3=250;
                total+=p3;
                break;
            case 4: p4=540;
                total+=p4;
                break;
        }

        Toast.makeText(getApplicationContext(),"Your final bill ="+total,Toast.LENGTH_SHORT).show();
        ft.commit();
    }
}