package android.example.tanta;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopsFragment extends Fragment {


    public ShopsFragment() {
        // Required empty public constructor
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place, container, false);
        final ArrayList<Place> Shops = new ArrayList<>();
        Shops.add(new Place(R.string.lahalibo_shop, R.string.laShops, R.drawable.ic_launcher_background, 4.1));
        Shops.add(new Place(R.string.kentShops, R.string.KentShopsadd, R.drawable.ic_launcher_background, 4.2));
        Shops.add(new Place(R.string.maanForAAAShops, R.string.maanShops, R.drawable.ic_launcher_background, 4.3));

        placeAdapter adapter = new placeAdapter(getActivity(), Shops, R.color.category_Shops);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}