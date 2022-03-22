package com.example.a25hdesign.CkeckOut.adapter;

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

public class NumberOrderAdapter extends RecyclerView.Adapter<NumberOrderAdapter.NumberOrderViewHolder> {
    List<MyCartModel> mListOrder;

    public NumberOrderAdapter(List<MyCartModel> mListOrder) {
        this.mListOrder = mListOrder;
    }

    public void SetDataListOrder(List<MyCartModel> list){
        this.mListOrder = list;
        notifyDataSetChanged();

    }
    @NonNull
    @Override
    public NumberOrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number_order,parent,false);
        return new NumberOrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberOrderViewHolder holder, int position) {
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

    public class NumberOrderViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMyCartOrder;
        TextView tvNameOrder;
        TextView tvDetailOrder;
        TextView tvAmountOrder;
        TextView tvTotalPrice;
        public NumberOrderViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMyCartOrder = itemView.findViewById(R.id.image_order_my_cart);
            tvNameOrder = itemView.findViewById(R.id.textview_name_order);
            tvDetailOrder = itemView.findViewById(R.id.textview_detail_order);
            tvTotalPrice = itemView.findViewById(R.id.textview_total_price);
        }
    }
}
