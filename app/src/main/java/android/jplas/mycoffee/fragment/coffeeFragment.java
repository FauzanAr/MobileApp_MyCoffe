package android.jplas.mycoffee.fragment;


import android.jplas.mycoffee.bankofclass.CustomListAdapter;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.jplas.mycoffee.R;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class coffeeFragment extends Fragment {

    ListView listView;
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
        View rootView = inflater.inflate(R.layout.fragment_coffee, container, false);
        CustomListAdapter list = new CustomListAdapter(getActivity(), nameArray, infoArray, imageArray);
        listView = (ListView) rootView.findViewById(R.id.listviewID);
        listView.setAdapter(list);
        return rootView;
    }

}
