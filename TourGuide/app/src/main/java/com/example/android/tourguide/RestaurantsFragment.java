package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> placesList = new ArrayList<Place>();
        placesList.add(new Place(getString(R.string.pizza_party_name),getString(R.string.pizza_party_short_description), getString(R.string.pizza_party_description), getString(R.string.pizza_party_address) , getString(R.string.pizza_party_phone),R.drawable.ppf ,R.drawable.pp1,R.drawable.pp2,R.drawable.pp3));
        placesList.add(new Place(getString(R.string.abou_Saleh_name), getString(R.string.abou_Saleh_short_description),getString(R.string.abou_Saleh_description), getString(R.string.abou_Saleh_address) , getString(R.string.abou_Saleh_phone),R.drawable.asf ,R.drawable.as1,R.drawable.as2,R.drawable.as3));
        placesList.add(new Place(getString(R.string.tuscany_name),getString(R.string.tuscany_short_description),getString(R.string.tuscany_description), getString(R.string.tuscany_address) , getString(R.string.tuscany_phone),R.drawable.tpf ,R.drawable.tp1,R.drawable.tp2,R.drawable.tp3));
        PlaceArrayAdapter itemsAdapter = new PlaceArrayAdapter( getActivity(), placesList);
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
        return view ;
    }

}
