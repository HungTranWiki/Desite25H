package com.example.a25hdesign.CkeckOut;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.a25hdesign.CkeckOut.activities.PaymentFragment;
import com.example.a25hdesign.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class CheckOutBottomSheet extends BottomSheetDialogFragment {

    TextView tvCancel, tvConfirmation;
    ImageButton btnBack;
    PaymentFragment mPaymentFragment;
    IOnClickConfirm mIOnClickConfirm;
    TextView txtRedeem;

    public CheckOutBottomSheet(TextView txtRedeem) {
        this.txtRedeem = txtRedeem;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        BottomSheetDialog bottomSheetDialogFragment = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.bottom_sheet_dialog_check_out,null);
        bottomSheetDialogFragment.setContentView(view);
        tvCancel = view.findViewById(R.id.textview_cancel);
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialogFragment.cancel();
            }
        });
        btnBack = view.findViewById(R.id.button_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialogFragment.cancel();
            }
        });

        tvConfirmation = bottomSheetDialogFragment.findViewById(R.id.textview_confirm);
        tvConfirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               bottomSheetDialogFragment.dismiss();
               txtRedeem.setText("Change");
            }
        });
        return bottomSheetDialogFragment;
    }
    @Override
    public int getTheme(){
        return R.style.AppBottomSheetDialogThemeCheckOut;
    }
}

