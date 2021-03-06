package com.example.a25hdesign.CkeckOut.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a25hdesign.CkeckOut.model.MyCartModel;
import com.example.a25hdesign.R;

import java.util.List;

public class MyCartAdapter extends RecyclerView.Adapter<MyCartAdapter.MyCartViewHolder>{
    List<MyCartModel> mListOrder;

    public MyCartAdapter(List<MyCartModel> mListOrder) {
        this.mListOrder = mListOrder;
    }

    public void SetDataListOrder(List<MyCartModel> list){
        this.mListOrder = list;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public MyCartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_my_cart,parent,false);
        return new MyCartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCartViewHolder holder, int position) {
        MyCartModel myCartModel = mListOrder.get(position);
        if (myCartModel == null){
            return;
        }

        holder.imgMyCartOrder.setImageResource(myCartModel.getImgModel());
        holder.tvNameOrder.setText(myCartModel.getNameOrdel());
        holder.tvDetailOrder.setText(myCartModel.getDetailOrder());
        holder.tvTotalPrice.setText(myCartModel.getTotalPrice());

    }

    @Override
    public int getItemCount() {
        if(mListOrder != null){
            return mListOrder.size();
        }
        return 0;
    }

    public class MyCartViewHolder extends RecyclerView.ViewHolder{
        ImageView imgMyCartOrder;
        TextView tvNameOrder;
        TextView tvDetailOrder;
        TextView tvAmountOrder;
        TextView tvTotalPrice;
        public MyCartViewHolder(@NonNull View itemView) {
            super(itemView);

            imgMyCartOrder = itemView.findViewById(R.id.image_order_my_cart);
            tvNameOrder = itemView.findViewById(R.id.textview_name_order);
            tvDetailOrder = itemView.findViewById(R.id.textview_detail_order);
            tvTotalPrice = itemView.findViewById(R.id.textview_total_price);
        }
    }
}
