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
public class MesuemFragment extends Fragment {


    public MesuemFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place, container, false);
        final ArrayList<Place> mesuems = new ArrayList<>();
        mesuems.add(new Place(R.string.tanta_mesuem, R.string.tMs, R.drawable.ic_launcher_background, 4.1));
        mesuems.add(new Place(R.string.tanta_mesuem, R.string.tMs, R.drawable.ic_launcher_background, 4.2));
        mesuems.add(new Place(R.string.tanta_mesuem, R.string.tMs, R.drawable.ic_launcher_background, 4.3));

        placeAdapter adapter = new placeAdapter(getActivity(), mesuems, R.color.category_museums);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}