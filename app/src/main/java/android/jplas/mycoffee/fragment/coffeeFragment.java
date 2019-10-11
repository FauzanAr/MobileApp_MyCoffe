package android.jplas.mycoffee.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.jplas.mycoffee.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class coffeeFragment extends Fragment {

    String[] nameArray = {"Cappucino","Espresso","Mocaccino"};
    String[] infoArray = {
            "Is an espresso-based coffee drink that originated in Italy, and is traditionally prepared with steamed milk foam (microfoam).",
            "Is coffee of Italian origin, brewed by forcing a small amount of nearly boiling water under pressure (expressing) through finely ground coffee beans.",
            "Is a chocolate-flavored variant of a caffè latte. Other commonly used spellings are mochaccino and also mochachino."
    };
    Integer[] imageArray = {
            R.drawable.cappucino,
            R.drawable.espresso,
            R.drawable.mocaccino
    };

    public coffeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coffee, container, false);
    }

}
