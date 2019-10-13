package android.jplas.mycoffee.fragment;


import android.jplas.mycoffee.bankofclass.Coffee;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.jplas.mycoffee.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class resultFragment extends Fragment {

    View view;
    Coffee coffee;

    public resultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_result, container, false);

        return view;
    }

}
