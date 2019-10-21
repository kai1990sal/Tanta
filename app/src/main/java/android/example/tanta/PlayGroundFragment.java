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
public class PlayGroundFragment extends Fragment {


    public PlayGroundFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place, container, false);
        final ArrayList<Place> playGround = new ArrayList<>();
        playGround.add(new Place(R.string.mina, R.string.minaadd, R.drawable.ic_launcher_background, 4.1));
        playGround.add(new Place(R.string.the_tower, R.string.theTowerPAdd, R.drawable.ic_launcher_background, 4.2));
        playGround.add(new Place(R.string.theGamerP, R.string.GamerAdd, R.drawable.ic_launcher_background, 4.3));

        placeAdapter adapter = new placeAdapter(getActivity(), playGround, R.color.category_PlayGround);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}