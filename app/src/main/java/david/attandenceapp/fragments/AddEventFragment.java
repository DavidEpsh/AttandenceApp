package david.attandenceapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

import david.attandenceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddEventFragment extends Fragment {
    private EditText mName;
    private EditText mVenue;
    private EditText mCity;
    private EditText mImage;
    private EditText mOrganizerName;
    private Calendar mEventDate;
    private Button mSaveButton;
    private Button mDatePicker;

    private View mRootView;

    public AddEventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView =  inflater.inflate(R.layout.fragment_add_event, container, false);

        initViews();
        return mRootView;
    }

    private void initViews() {
    }

}
