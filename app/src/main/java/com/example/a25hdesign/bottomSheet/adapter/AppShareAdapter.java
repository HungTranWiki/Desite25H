package com.example.a25hdesign.bottomSheet.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a25hdesign.R;
import com.example.a25hdesign.bottomSheet.model.AppModel;
import com.example.a25hdesign.bottomSheet.model.AvatarModel;

import java.util.List;

public class AppShareAdapter extends RecyclerView.Adapter<AppShareAdapter.AppShareViewHolder>{

    List<AppModel> listAppShare;

    public AppShareAdapter(List<AppModel> listAppShare) {
        this.listAppShare = listAppShare;
    }

    @NonNull
    @Override
    public AppShareViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_app,parent,false);

        return new AppShareViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppShareViewHolder holder, int position) {
        AppModel appModel = listAppShare.get(position);
        {
            if (appModel == null){
                return;
            }
            holder.btnAppShare.setImageResource(appModel.getImgApp());
            holder.tvAppShare.setText(appModel.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        if(listAppShare != null){
            return listAppShare.size();
        }
        return 0;
    }

    public class AppShareViewHolder extends RecyclerView.ViewHolder{
        ImageView btnAppShare;
        TextView tvAppShare;
        public AppShareViewHolder(@NonNull View itemView) {
            super(itemView);
            btnAppShare = itemView.findViewById(R.id.button_app_share);
            tvAppShare = itemView.findViewById(R.id.textview_name_appshare);
        }
    }
}
