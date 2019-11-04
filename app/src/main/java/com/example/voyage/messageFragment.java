package com.example.voyage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class messageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.message_fragment, container, false);
        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.messagerecycle);

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // this is data fro recycler view

        String [] company = {"Crux", "TravelX", "Nature"};
        String[] place = {"Kashmir", "Naran & Kaghan","Murree"};
        int[] images = {R.drawable.email, R.drawable.email, R.drawable.email};

        // 3. create an adapter and set adapter
        recyclerView.setAdapter(new TripsAdapter(company,place,images));
        return rootView;
    }

}
