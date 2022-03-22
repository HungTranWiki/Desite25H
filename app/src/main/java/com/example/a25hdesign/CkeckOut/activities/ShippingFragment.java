package com.example.a25hdesign.CkeckOut.activities;

import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.a25hdesign.CkeckOut.CartActivity;
import com.example.a25hdesign.CkeckOut.adapter.MyCartAdapter;
import com.example.a25hdesign.CkeckOut.adapter.NumberOrderAdapter;
import com.example.a25hdesign.CkeckOut.adapter.ShippingAddressAdapter;
import com.example.a25hdesign.CkeckOut.model.CardModel;
import com.example.a25hdesign.CkeckOut.model.MyCartModel;
import com.example.a25hdesign.CkeckOut.model.ShippingAddressModel;
import com.example.a25hdesign.MainActivity;
import com.example.a25hdesign.R;

import java.util.ArrayList;
import java.util.List;


public class ShippingFragment extends Fragment {

    Button btnNext;
    CartActivity mCartActivity;
    RecyclerView mRcvOrderShipping;
    NumberOrderAdapter mNumberOrderAdapter;
    RecyclerView mRcvAddressShipping;
    ShippingAddressAdapter mShippingAddressAdapter;
    Button btnAddAddress;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shipping, container, false);

         mRcvOrderShipping = view.findViewById(R.id.rcv_order_shipping);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRcvOrderShipping.setLayoutManager(linearLayoutManager);

        mNumberOrderAdapter = new NumberOrderAdapter(getListOrderShipping());
        mRcvOrderShipping.setAdapter(mNumberOrderAdapter);

        mCartActivity = (CartActivity) getActivity();
        btnNext = view.findViewById(R.id.button_next_fragment_shipping);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mCartActivity.goToFragmentPayment();
            }
        });

        mRcvAddressShipping = view.findViewById(R.id.rcv_my_shipping_address);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        mRcvAddressShipping.setLayoutManager(linearLayoutManager1);
        mShippingAddressAdapter = new ShippingAddressAdapter(getListAddress());
        mRcvAddressShipping.setAdapter(mShippingAddressAdapter);

        btnAddAddress = view.findViewById(R.id.button_add_address);
        if (mRcvAddressShipping != null){
            btnAddAddress.setVisibility(View.GONE);
        }


        return view;
    }

    private List<ShippingAddressModel> getListAddress() {
        List<ShippingAddressModel> listAddress = new ArrayList<>();
        listAddress.add(new ShippingAddressModel("Jane Smith","70A Street Name, 08-115","Singapore 346897"));
        listAddress.add(new ShippingAddressModel("Jane Smith","70A Street Name, 08-115","Singapore 346897"));

        return listAddress;
    }


    private List<MyCartModel> getListOrderShipping() {
        List<MyCartModel> listOrderShipping = new ArrayList<>();

        listOrderShipping.add(new MyCartModel(R.drawable.image_musk_melon,"Musk Melon","THE TIME • $110.30 • 11 Points","$110.30","Qty: 1"));
        listOrderShipping.add(new MyCartModel(R.drawable.food,"Boiled Snow Crab Meat Flakes 200g","$34.50 • 3 Points","$69.00","Qty: 2"));

        return listOrderShipping;
    }
}

