package com.example.a25hdesign.favorite.Privileges;

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

public class PrivilegesFragment extends Fragment {
    RecyclerView rcvPrivileges;
    PrivilegesAdapter mPrivilegesAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.privileges_fragment, container, false);
        mPrivilegesAdapter = new PrivilegesAdapter(getContext());

        rcvPrivileges = view.findViewById(R.id.rcv_privileges);
        rcvPrivileges.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rcvPrivileges.setLayoutManager(linearLayoutManager);

        mPrivilegesAdapter.setDataPrivileges(getListPrivileges());
        rcvPrivileges.setAdapter(mPrivilegesAdapter);
        return view;
    }

    private List<PrivilegesModel> getListPrivileges() {
        List<PrivilegesModel> list = new ArrayList<>();
        list.add(new PrivilegesModel(R.drawable.img_privileges,"Priority Reservation","Partner Name Placeholder lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam sit","Location Cuisine","Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos and..."));
        list.add(new PrivilegesModel(R.drawable.img_privileges,"Priority Reservation","Partner Name Placeholder lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam sit","Location Cuisine","Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos and..."));
        list.add(new PrivilegesModel(R.drawable.img_privileges,"Priority Reservation","Partner Name Placeholder lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam sit","Location Cuisine","Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos and..."));
        list.add(new PrivilegesModel(R.drawable.img_privileges,"Priority Reservation","Partner Name Placeholder lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam sit","Location Cuisine","Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos and..."));
        list.add(new PrivilegesModel(R.drawable.img_privileges,"Priority Reservation","Partner Name Placeholder lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam sit","Location Cuisine","Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos and..."));
        list.add(new PrivilegesModel(R.drawable.img_privileges,"Priority Reservation","Partner Name Placeholder lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam sit","Location Cuisine","Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos and..."));

        return list;
    }
}
