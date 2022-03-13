package com.example.a25hdesign.bottomSheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.a25hdesign.R;
import com.example.a25hdesign.bottomSheet.model.AppModel;
import com.example.a25hdesign.bottomSheet.model.AvatarModel;

import java.util.ArrayList;
import java.util.List;

public class BottomSheetActivity extends AppCompatActivity {

    Button btnShare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);

        btnShare = findViewById(R.id.button_share);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOpenBottomSheet();
            }
        });


    }

    private void clickOpenBottomSheet() {


        List<AppModel> listApp = new ArrayList<>();
        listApp.add(new AppModel(R.drawable.icon_messenger,"Messenger"));
        listApp.add(new AppModel(R.drawable.icon_messenger,"Messenger"));
        listApp.add(new AppModel(R.drawable.icon_messenger,"Messenger"));
        listApp.add(new AppModel(R.drawable.icon_messenger,"Messenger"));
        listApp.add(new AppModel(R.drawable.icon_messenger,"Messenger"));
        listApp.add(new AppModel(R.drawable.icon_messenger,"Messenger"));

        List<AvatarModel> list = new ArrayList<>();
        list.add(new AvatarModel(R.drawable.avatar,R.drawable.icon_messenger,"Micheal Jackson"));
        list.add(new AvatarModel(R.drawable.avatar,R.drawable.icon_messenger,"Micheal Jackson"));
        list.add(new AvatarModel(R.drawable.avatar,R.drawable.icon_messenger,"Micheal Jackson"));
        list.add(new AvatarModel(R.drawable.avatar,R.drawable.icon_messenger,"Micheal Jackson"));
        list.add(new AvatarModel(R.drawable.avatar,R.drawable.icon_messenger,"Micheal Jackson"));
        list.add(new AvatarModel(R.drawable.avatar,R.drawable.icon_messenger,"Micheal Jackson"));
        list.add(new AvatarModel(R.drawable.avatar,R.drawable.icon_messenger,"Micheal Jackson"));




        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(listApp, list);

        bottomSheetDialog.show(getSupportFragmentManager(), bottomSheetDialog.getTag());
    }
}