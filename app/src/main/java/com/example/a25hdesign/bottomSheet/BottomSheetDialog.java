package com.example.a25hdesign.bottomSheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a25hdesign.R;
import com.example.a25hdesign.bottomSheet.adapter.AvatarAdapter;
import com.example.a25hdesign.bottomSheet.model.AvatarModel;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.List;

public class BottomSheetDialog extends BottomSheetDialogFragment {
    private List<AvatarModel> ListAvatar;

    public BottomSheetDialog(List<AvatarModel> listAvatar) {
        ListAvatar = listAvatar;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog bottomSheetDialog = super.onCreateDialog(savedInstanceState);

        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet,null);
        bottomSheetDialog.setContentView(view);
        RecyclerView rcvAvatar = view.findViewById(R.id.rcv_avatar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rcvAvatar.setLayoutManager(linearLayoutManager);
        AvatarAdapter avatarAdapter = new AvatarAdapter(ListAvatar);
        return bottomSheetDialog;

    }
}
