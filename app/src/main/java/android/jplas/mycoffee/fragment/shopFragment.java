package android.jplas.mycoffee.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.jplas.mycoffee.R;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class shopFragment extends Fragment implements View.OnClickListener {

    View view;
    Button button;
    RadioGroup radioGroup;
    EditText textNama, textJumlah;

    public shopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_shop, container, false);

        textNama = view.findViewById(R.id.text_nama);
        textJumlah = view.findViewById(R.id.text_jumlah);
        radioGroup = view.findViewById(R.id.radio_group);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        String nama = textNama.getText().toString();
        int tipe = 0;
        int checkId = radioGroup.getCheckedRadioButtonId();
        if ((checkId != -1) && !TextUtils.isEmpty(nama)){
            int jumlah = Integer.parseInt(textJumlah.getText().toString());
            if(checkId == R.id.radio_cappucino){
                tipe = Coffee
            }
        }
    }
}
