package com.example.a25hdesign.CkeckOut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.a25hdesign.CkeckOut.activities.CompleteConfirmFragment;
import com.example.a25hdesign.CkeckOut.activities.ConfirmationFragment;
import com.example.a25hdesign.CkeckOut.activities.PaymentFragment;
import com.example.a25hdesign.CkeckOut.activities.ShippingFragment;
import com.example.a25hdesign.CkeckOut.adapter.MyCartAdapter;
import com.example.a25hdesign.CkeckOut.model.MyCartModel;
import com.example.a25hdesign.CkeckOut.model.ShippingAddressModel;
import com.example.a25hdesign.MainActivity;
import com.example.a25hdesign.R;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    Button btnCheckOut;
    RecyclerView mRcvMyCartOrder;
    MyCartAdapter mMyCartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        mRcvMyCartOrder = findViewById(R.id.rcv_my_cart);
        mRcvMyCartOrder.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRcvMyCartOrder.setLayoutManager(linearLayoutManager);

        mMyCartAdapter = new MyCartAdapter(getListOrder());
        mRcvMyCartOrder.setAdapter(mMyCartAdapter);

        btnCheckOut = findViewById(R.id.button_checkout_my_cart);
        btnCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ShippingFragment shippingFragment = new ShippingFragment();
                fragmentTransaction.add(R.id.layout_shipping_fragment,shippingFragment);
                fragmentTransaction.commit();
            }
        });

    }
    public void goToFragmentPayment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PaymentFragment paymentFragment = new PaymentFragment();
//        Bundle bundle = new Bundle();
//        bundle.putSerializable("Data", shippingAddressModel);
//        paymentFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.layout_shipping_fragment,paymentFragment);
        fragmentTransaction.commit();
    }
    public void goToFragmentConfirmation(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ConfirmationFragment confirmationFragment = new ConfirmationFragment();
//        Bundle bundle = new Bundle();
//        bundle.putSerializable("Data", shippingAddressModel);
//        paymentFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.layout_shipping_fragment,confirmationFragment);
        fragmentTransaction.commit();
    }

    public void goToFragmentCompleteConfirmation(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CompleteConfirmFragment completeConfirmFragment = new CompleteConfirmFragment();
//        Bundle bundle = new Bundle();
//        bundle.putSerializable("Data", shippingAddressModel);
//        paymentFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.layout_shipping_fragment,completeConfirmFragment);
        fragmentTransaction.commit();
    }

    private List<MyCartModel> getListOrder() {
        List<MyCartModel> listOrder = new ArrayList<>();
        listOrder.add(new MyCartModel(R.drawable.image_musk_melon,"Musk Melon","THE TIME • $110.30 • 11 Points","$110.30","1"));
        listOrder.add(new MyCartModel(R.drawable.food,"Boiled Snow Crab Meat Flakes 200g","$34.50 • 3 Points","$69.00","2"));

        return listOrder;
    }
}