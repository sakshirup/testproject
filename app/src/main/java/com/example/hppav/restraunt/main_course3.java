package com.example.hppav.restraunt;

/**
 * Created by HP PAV on 11-04-2017.
 */

import android.support.v4.app.ListFragment;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hppav.restraunt.main_course1;

//import com.example.hppav.myapplication.Workout;

/**
 * A simple {@link ListFragment} subclass.
 */
public class main_course3 extends ListFragment {

    public static interface WorkoutListListener{
        void itemCLicked(long id);
    }
    private WorkoutListListener listener;
    public main_course3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[main_course1.workouts.length];
        for(int i=0 ; i<names.length; i++)
            names[i] = main_course1.workouts[i].getname();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(),android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        this.listener=(WorkoutListListener)activity;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position,long id)
    {
        if(listener!=null)
            listener.itemCLicked(id);
    }

}