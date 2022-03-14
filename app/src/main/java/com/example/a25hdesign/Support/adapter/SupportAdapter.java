package com.example.a25hdesign.Support.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a25hdesign.R;
import com.example.a25hdesign.Support.model.ItemSupportModel;

import java.util.List;

public class SupportAdapter extends RecyclerView.Adapter<SupportAdapter.SupportViewHolder>{
    private List<ItemSupportModel> listItem;
    private Context mContext;
    private SupportFAQsInterface supportFAQsInterface;

    public SupportAdapter(Context mContext, SupportFAQsInterface supportFAQsInterface) {
        this.mContext = mContext;
        this.supportFAQsInterface = supportFAQsInterface;
    }

    public void setDataListItem(List<ItemSupportModel> listItem){
        this.listItem = listItem;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SupportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_support,parent,false);
        return new SupportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SupportViewHolder holder, int position) {
        ItemSupportModel itemSupportModel = listItem.get(position);
        if(itemSupportModel == null){
            return;
        }
        holder.tvTitle.setText(itemSupportModel.getTitle());
        holder.tvContent.setText(itemSupportModel.getContent());

        holder.linearLayoutItemClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                supportFAQsInterface.onClickListener(holder.tvTitle, holder.tvContent, itemSupportModel);
            }
        });
    }



    @Override
    public int getItemCount() {
        if (listItem != null){
            return listItem.size();
        }
        return 0;
    }

    public class SupportViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        TextView tvContent;
        LinearLayout linearLayoutItemClick;
        public SupportViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayoutItemClick = itemView.findViewById(R.id.item_click);
            tvTitle = itemView.findViewById(R.id.textview_title);
            tvContent = itemView.findViewById(R.id.textview_content_body_support);
        }
    }
}
