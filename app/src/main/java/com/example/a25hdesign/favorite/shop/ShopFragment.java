package com.example.a25hdesign.favorite.shop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a25hdesign.R;

import java.util.ArrayList;
import java.util.List;

public class ShopFragment extends Fragment {

    RecyclerView rcvShop;
    ShopRecyclerviewAdapter mShopRecyclerviewAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shop_fragment, container, false);

        mShopRecyclerviewAdapter = new ShopRecyclerviewAdapter(getContext());

        rcvShop = view.findViewById(R.id.rcv_shop);
        rcvShop.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        rcvShop.setLayoutManager(gridLayoutManager);

        mShopRecyclerviewAdapter.setData(getListShopModel());
        rcvShop.setAdapter(mShopRecyclerviewAdapter);
        return view;


    }

    private List<ShopModel> getListShopModel() {
        List<ShopModel> list = new ArrayList<>();
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));
        list.add(new ShopModel(R.drawable.ic_launcher_foreground,"Shop name 1", "$50"));

        return list;
    }
}

