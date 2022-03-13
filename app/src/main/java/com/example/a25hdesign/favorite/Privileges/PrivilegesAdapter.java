package com.example.a25hdesign.favorite.Privileges;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.a25hdesign.R;

import java.util.List;

public class PrivilegesAdapter extends RecyclerView.Adapter<PrivilegesAdapter.PrivilegesViewHolder>{
    private Context mContext;
    private List<PrivilegesModel> mListPrivileges;

    public PrivilegesAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setDataPrivileges(List<PrivilegesModel> listPrivileges){
        this.mListPrivileges = listPrivileges;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PrivilegesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_privileges,parent,false);
        return new PrivilegesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PrivilegesViewHolder holder, int position) {
        PrivilegesModel privilegesModel = mListPrivileges.get(position);
        if(privilegesModel == null){
            return;
        }
        holder.imgLogoPrivileges.setImageResource(privilegesModel.getLogoPrivileges());
        holder.txtStatus.setText(privilegesModel.getStatus());
        holder.txtTitle.setText(privilegesModel.getTitle());
        holder.txtCategory.setText(privilegesModel.getCategory());
        holder.txtDesc.setText(privilegesModel.getDesc());
    }

    @Override
    public int getItemCount() {
        if(mListPrivileges != null){
            return mListPrivileges.size();
        }
        return 0;
    }

    public class PrivilegesViewHolder extends RecyclerView.ViewHolder{
        ImageView imgLogoPrivileges;
        TextView txtStatus, txtTitle, txtCategory, txtDesc;

        public PrivilegesViewHolder(@NonNull View itemView) {
            super(itemView);

            imgLogoPrivileges = itemView.findViewById(R.id.imageLogo_privileges);
            txtStatus = itemView.findViewById(R.id.textview_status_privileges);
            txtTitle = itemView.findViewById(R.id.textview_title_privileges);
            txtCategory = itemView.findViewById(R.id.textview_category_privileges);
            txtDesc = itemView.findViewById(R.id.textview_desc_privileges);
        }
    }
}
