package com.example.a25hdesign.CkeckOut.activities;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.a25hdesign.CkeckOut.CartActivity;
import com.example.a25hdesign.CkeckOut.CheckOutBottomSheet;
import com.example.a25hdesign.CkeckOut.adapter.MyCartAdapter;
import com.example.a25hdesign.CkeckOut.adapter.NumberOrderAdapter;
import com.example.a25hdesign.CkeckOut.adapter.PaymentCardAdapter;
import com.example.a25hdesign.CkeckOut.adapter.ShippingAddressAdapter;
import com.example.a25hdesign.CkeckOut.model.CardModel;
import com.example.a25hdesign.CkeckOut.model.MyCartModel;
import com.example.a25hdesign.CkeckOut.model.ShippingAddressModel;
import com.example.a25hdesign.R;

import java.util.ArrayList;
import java.util.List;


public class PaymentFragment extends Fragment {
    RecyclerView mRcvOrderPayment;
    NumberOrderAdapter mNumberOrderAdapter;
    RecyclerView mRcvAddCard;
    PaymentCardAdapter mPaymentCardAdapter;
    Button btnAddCard,btnNext;
    TextView tvRedeem;
    CartActivity mCartActivity;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_payment, container, false);
        mRcvOrderPayment = view.findViewById(R.id.rcv_order_payment);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRcvOrderPayment.setLayoutManager(linearLayoutManager);

        mNumberOrderAdapter = new NumberOrderAdapter(getListOrderPayment());
        mRcvOrderPayment.setAdapter(mNumberOrderAdapter);


        mRcvAddCard = view.findViewById(R.id.rcv_add_card);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        mRcvAddCard.setLayoutManager(linearLayoutManager1);
        mPaymentCardAdapter = new PaymentCardAdapter(getListCard());
        mRcvAddCard.setAdapter(mPaymentCardAdapter);

        tvRedeem = view.findViewById(R.id.textview_redeem);
        tvRedeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckOutBottomSheet checkOutBottomSheet = new CheckOutBottomSheet(tvRedeem);
                checkOutBottomSheet.show(getChildFragmentManager(),checkOutBottomSheet.getTag());
            }
        });

        mCartActivity = (CartActivity) getActivity();
        btnNext = view.findViewById(R.id.button_next_payment);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCartActivity.goToFragmentConfirmation();
            }
        });

        btnAddCard = view.findViewById(R.id.button_add_card);

        if(mRcvAddCard != null){
            btnAddCard.setVisibility(View.GONE);
        }

        return view;
    }

    private List<CardModel> getListCard() {
        List<CardModel> listCard = new ArrayList<>();
        listCard.add(new CardModel("Jane Smith","XXXX-4693","12/23"));
        listCard.add(new CardModel("Jane Smith","XXXX-4693","12/23"));

        return listCard;
    }

    private List<MyCartModel> getListOrderPayment() {
        List<MyCartModel> listOrderPayment = new ArrayList<>();

        listOrderPayment.add(new MyCartModel(R.drawable.image_musk_melon,"Musk Melon","THE TIME • $110.30 • 11 Points","$110.30","Qty: 1"));
        listOrderPayment.add(new MyCartModel(R.drawable.food,"Boiled Snow Crab Meat Flakes 200g","$34.50 • 3 Points","$69.00","Qty: 2"));

        return listOrderPayment;
    }
}