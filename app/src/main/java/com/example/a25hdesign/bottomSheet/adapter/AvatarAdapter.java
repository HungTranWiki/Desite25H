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
import com.example.a25hdesign.bottomSheet.model.AvatarModel;

import org.w3c.dom.Text;

import java.util.List;

public class AvatarAdapter extends RecyclerView.Adapter<AvatarAdapter.AvartarViewHolder>{
    private List<AvatarModel> mListAvatar;

    public AvatarAdapter(List<AvatarModel> mListAvatar) {
        this.mListAvatar = mListAvatar;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AvartarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_avatar,parent,false);
        return new AvartarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AvartarViewHolder holder, int position) {
        AvatarModel avatarModel = mListAvatar.get(position);
        if(avatarModel == null){
            return;
        }
        holder.imgAvatar.setImageResource(avatarModel.getImgAvartar());
        holder.imgSmallIcon.setImageResource(avatarModel.getImgSmallIcon());
        holder.tvName.setText(avatarModel.getName());
    }

    @Override
    public int getItemCount() {
        if(mListAvatar != null){
            return mListAvatar.size();
        }
        return 0;
    }

    public class AvartarViewHolder extends RecyclerView.ViewHolder{
        ImageButton imgAvatar;
        ImageView imgSmallIcon;
        TextView tvName;
        public AvartarViewHolder(@NonNull View itemView) {
            super(itemView);

            imgAvatar = itemView.findViewById(R.id.image_avatar1);
            imgSmallIcon = itemView.findViewById(R.id.image_small_icon1);
            tvName = itemView.findViewById(R.id.textview_name_avatar1);
        }
    }
}
