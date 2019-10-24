package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EntertainmentFragment extends Fragment {


    public EntertainmentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> placesList = new ArrayList<Place>();
        placesList.add(new Place(getString(R.string.fox_name), getString(R.string.fox_short_description), getString(R.string.fox_description), getString(R.string.fox_address), getString(R.string.fox_phone), R.drawable.fof, R.drawable.fo1, R.drawable.fo2, R.drawable.fo3));
        placesList.add(new Place(getString(R.string.arizona_name), getString(R.string.arizona_short_description), getString(R.string.arizona_description), getString(R.string.arizona_address), getString(R.string.arizona_phone), R.drawable.arf, R.drawable.ar1, R.drawable.ar2, R.drawable.ar3));
        PlaceArrayAdapter itemsAdapter = new PlaceArrayAdapter(getActivity(), placesList);
        ListView listView = view.findViewById(R.id.places_list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                Place currentPlace = placesList.get(position);
                Intent intent = new Intent(view.getContext(), Details.class);
                intent.putExtra("front image id", currentPlace.getFront_image_id());
                intent.putExtra("image 1 id", currentPlace.getImage1_id());
                intent.putExtra("image 2 id", currentPlace.getImage2_id());
                intent.putExtra("image 3 id", currentPlace.getImage3_id());
                intent.putExtra("place name", currentPlace.getPlace_name());
                intent.putExtra("place address", currentPlace.getPlace_address());
                intent.putExtra("place phone", currentPlace.getPlace_phone());
                intent.putExtra("place description", currentPlace.getPlace_description());
                startActivity(intent);
            }
        });
        return view;
    }

}
