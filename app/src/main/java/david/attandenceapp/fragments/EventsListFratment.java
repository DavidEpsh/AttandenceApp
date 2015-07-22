package david.attandenceapp.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import david.attandenceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsListFratment extends Fragment {


    public EventsListFratment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_events_list_fratment, container, false);
    }


}
