package com.example.a25hdesign.favorite.shop;

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

public class ShopRecyclerviewAdapter extends RecyclerView.Adapter<ShopRecyclerviewAdapter.ShopViewHolder>{
    private Context mContext;
    private List<ShopModel> mListShopModel;

    public ShopRecyclerviewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<ShopModel> list){
        this.mListShopModel = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item_view,parent,false);
        return new ShopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
        ShopModel shopModel = mListShopModel.get(position);
        if(shopModel == null){
            return;
        }
        holder.imgShop.setImageResource(shopModel.getShopImage());
        holder.tvShopName.setText(shopModel.getShopname());
        holder.tvShopPrice.setText(shopModel.getShopPrice());
    }

    @Override
    public int getItemCount() {
        if(mListShopModel != null){
            return mListShopModel.size();
        }
        return 0;
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder{
        ImageView imgShop;
        TextView tvShopName;
        TextView tvShopPrice;

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);

            imgShop = itemView.findViewById(R.id.imageview_shop);
            tvShopName = itemView.findViewById(R.id.textview_name_shop);
            tvShopPrice = itemView.findViewById(R.id.textview_price_shop);
        }
    }
}
