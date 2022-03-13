package com.example.a25hdesign.favorite.Events;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a25hdesign.R;

import java.util.ArrayList;
import java.util.List;

public class EventsFragment extends Fragment {
    RecyclerView rcvEvent;
    EventAdapter mEventAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.events_fragment, container, false);
        mEventAdapter = new EventAdapter(getContext());

        rcvEvent = view.findViewById(R.id.rcv_event);
        rcvEvent.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rcvEvent.setLayoutManager(linearLayoutManager);

        mEventAdapter.setDataEvent(getListEvent());
        rcvEvent.setAdapter(mEventAdapter);
        return view;
    }

    private List<EventsModel> getListEvent() {
        List<EventsModel> list = new ArrayList<>();
        list.add(new EventsModel(R.drawable.ic_launcher_background,"Online","EventName","Description event","10 jan 2022"));
        list.add(new EventsModel(R.drawable.ic_launcher_background,"Online","EventName","Description event","10 jan 2022"));
        list.add(new EventsModel(R.drawable.ic_launcher_background,"Online","EventName","Description event","10 jan 2022"));
        list.add(new EventsModel(R.drawable.ic_launcher_background,"Online","EventName","Description event","10 jan 2022"));
        list.add(new EventsModel(R.drawable.ic_launcher_background,"Online","EventName","Description event","10 jan 2022"));
        return list;
    }
}
