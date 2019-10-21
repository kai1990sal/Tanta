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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place, container, false);
        final ArrayList<Place> Restaurants = new ArrayList<>();
        Restaurants.add(new Place(R.string.lahalibo, R.string.lahliboAdd, R.drawable.ic_launcher_background, 4.1));
        Restaurants.add(new Place(R.string.macdonaldz, R.string.macdonaldzadd, R.drawable.ic_launcher_background, 4.2));
        Restaurants.add(new Place(R.string.kentaki, R.string.kentakiadd, R.drawable.ic_launcher_background, 4.3));

        placeAdapter adapter = new placeAdapter(getActivity(), Restaurants, R.color.category_restaurants);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}