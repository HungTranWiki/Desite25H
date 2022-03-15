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
import com.example.a25hdesign.bottomSheet.adapter.AppShareAdapter;
import com.example.a25hdesign.bottomSheet.adapter.AvatarAdapter;
import com.example.a25hdesign.bottomSheet.model.AppModel;
import com.example.a25hdesign.bottomSheet.model.AvatarModel;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.List;

public class BottomSheetDialog extends BottomSheetDialogFragment {
    private List<AvatarModel> listAvatar;
    private List<AppModel> listAppShare;

    public BottomSheetDialog(List<AppModel> listAppShare, List<AvatarModel> listAvatar) {
        this.listAvatar = listAvatar;
        this.listAppShare = listAppShare;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = (com.google.android.material.bottomsheet.BottomSheetDialog) super.onCreateDialog(savedInstanceState);

        View view = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet,null);
        bottomSheetDialog.setContentView(view);

        RecyclerView rcvAvatar = view.findViewById(R.id.rcv_avatar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rcvAvatar.setLayoutManager(linearLayoutManager);
        rcvAvatar.setHasFixedSize(true);

        AvatarAdapter avatarAdapter = new AvatarAdapter(listAvatar);
        rcvAvatar.setAdapter(avatarAdapter);

        RecyclerView rcvAppShare = view.findViewById(R.id.rcv_app_share);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        rcvAppShare.setLayoutManager(linearLayoutManager1);
        rcvAppShare.setHasFixedSize(true);
        AppShareAdapter appShareAdapter = new AppShareAdapter(listAppShare);
        rcvAppShare.setAdapter(appShareAdapter);


        return bottomSheetDialog;
    }
    @Override
    public int getTheme(){
        return R.style.AppBottomSheetDialogTheme;
    }
}
