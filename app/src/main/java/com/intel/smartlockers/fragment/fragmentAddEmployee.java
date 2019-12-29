package com.intel.smartlockers.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.intel.smartlockers.R;

public class fragmentAddEmployee extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_employee,null);

        addControls(view);
        addEvents(view);

        Log.w("TAG_LOG", "In EMPLOYEE");

        return view;
    }

    @Override
    public void onClick(View v) {

    }

    private void addEvents(View view) {
    }

    private void addControls(View view) {

    }

}
