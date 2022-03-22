package com.example.a25hdesign.CkeckOut.activities;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.a25hdesign.CkeckOut.CartActivity;
import com.example.a25hdesign.CkeckOut.adapter.NumberOrderAdapter;
import com.example.a25hdesign.CkeckOut.model.MyCartModel;
import com.example.a25hdesign.R;

import java.util.ArrayList;
import java.util.List;


public class ConfirmationFragment extends Fragment {

    NumberOrderAdapter mNumberOrderAdapter;
    RecyclerView mRcvConfirmation;
    Button mBtnConfirmation;
    CartActivity mCartActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_confirmation, container, false);

        mRcvConfirmation = view.findViewById(R.id.rcv_Confirmation);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRcvConfirmation.setLayoutManager(linearLayoutManager);

        mNumberOrderAdapter = new NumberOrderAdapter(getListOrderPayment());
        mRcvConfirmation.setAdapter(mNumberOrderAdapter);

        mBtnConfirmation = view.findViewById(R.id.button_next_confirmation);

        mCartActivity = (CartActivity) getActivity();
        mBtnConfirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCartActivity.goToFragmentCompleteConfirmation();
            }
        });
        return view;
    }

    private List<MyCartModel> getListOrderPayment() {
        List<MyCartModel> listOrderPayment = new ArrayList<>();

        listOrderPayment.add(new MyCartModel(R.drawable.image_musk_melon,"Musk Melon","THE TIME • $110.30 • 11 Points","$110.30","Qty: 1"));
        listOrderPayment.add(new MyCartModel(R.drawable.food,"Boiled Snow Crab Meat Flakes 200g","$34.50 • 3 Points","$69.00","Qty: 2"));

        return listOrderPayment;
    }
}