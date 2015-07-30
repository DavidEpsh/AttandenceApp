package david.attandenceapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import david.attandenceapp.R;
import david.attandenceapp.models.Attendant;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddAttendantFragment extends Fragment {

    private EditText mName;
    private EditText mEmail;
    private EditText mPhone;
    private EditText mStreetAddress;
    private EditText mCity;
    private EditText mState;
    private EditText mPostal;
    private Button mSaveButton;
    private ImageButton mPictureButton;

    private View mRootView;

    public AddAttendantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_add_attendant, container, false);
        initView();
        return mRootView;
    }

    private void initView() {
        mName = (EditText) mRootView.findViewById(R.id.edit_text_attendant_name);
        mEmail = (EditText) mRootView.findViewById(R.id.edit_text_attendant_email);
        mPhone = (EditText) mRootView.findViewById(R.id.edit_text_attendant_phone);
        mPhone.setInputType(InputType.TYPE_CLASS_PHONE);
        mPhone.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        mStreetAddress = (EditText) mRootView.findViewById(R.id.edit_text_attendant_street_address);
        mCity = (EditText) mRootView.findViewById(R.id.edit_text_attendant_city);
        mState = (EditText) mRootView.findViewById(R.id.edit_text_attendant_state);
        mPostal = (EditText) mRootView.findViewById(R.id.edit_text_attendant_zip_code);

        mSaveButton = (Button) mRootView.findViewById(R.id.save_button);
        mPictureButton = (ImageButton) mRootView.findViewById(R.id.pictureImageButton);


        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (requiredFieldCompleted()){
                    saveAttendant();
                }
            }
        });
    }

    private boolean requiredFieldCompleted() {
        boolean isFilled = false;

        if (mName.getText() != null && !mName.getText().toString().isEmpty()) {
            isFilled = true;
        } else {
            mName.setError(getString(R.string.required_fields_empty));
        }

        if (mEmail.getText() != null && android.util.Patterns.EMAIL_ADDRESS.matcher(mEmail.getText()).matches()) {
            isFilled = true;
        } else {
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(mEmail.getText()).matches())
                mEmail.setError("Wrong Email Input");
            else {
                mEmail.setError(getString(R.string.required_fields_empty));
            }
            isFilled = false;
        }

        return isFilled;
    }

    private void saveAttendant() {

        Attendant mAttendant = new Attendant();
        mAttendant.setName(mName.getText().toString());
        mAttendant.setEmail(mEmail.getText().toString());
        mAttendant.setPhoneNumber(mPhone.getText().toString());
        mAttendant.setStreetAddress(mStreetAddress.getText().toString());
        mAttendant.setCity(mCity.getText().toString());
        mAttendant.setState(mState.getText().toString());
        mAttendant.setPostalCode(mPostal.getText().toString());

        //todo Save to database

        resetFields();

        Toast.makeText(getActivity(), mAttendant.getName() + " saved", Toast.LENGTH_SHORT).show();
    }

    private void resetFields() {

        mName.setText("");
        mEmail.setText("");
        mPhone.setText("");
        mStreetAddress.setText("");
        mCity.setText("");
        mState.setText("");
        mPostal.setText("");
    }

}
