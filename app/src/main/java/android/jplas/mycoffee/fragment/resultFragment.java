package android.jplas.mycoffee.fragment;


import android.jplas.mycoffee.bankofclass.Coffee;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.jplas.mycoffee.R;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class resultFragment extends Fragment {

    View view;
    Coffee coffee;
    TextView textNama, textJumlah, textTotal, textTipe;

    public resultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_result, container, false);
        textNama = view.findViewById(R.id.name_result_text);
        textJumlah = view.findViewById(R.id.jumlah_result_text);
        textTotal = view.findViewById(R.id.total_result_text);
        textTipe = view.findViewById(R.id.tipe_result_text);
        return view;
    }

}
