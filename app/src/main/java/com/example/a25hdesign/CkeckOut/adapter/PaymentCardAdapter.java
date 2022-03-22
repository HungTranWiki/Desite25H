package com.example.a25hdesign.CkeckOut.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a25hdesign.CkeckOut.model.CardModel;
import com.example.a25hdesign.CkeckOut.model.ShippingAddressModel;
import com.example.a25hdesign.R;

import java.util.List;

public class PaymentCardAdapter extends RecyclerView.Adapter<PaymentCardAdapter.PaymentCardViewHolder>{
    List<CardModel> listCard;

    public PaymentCardAdapter(List<CardModel> listCard) {
        this.listCard = listCard;
    }

    public void SetDataListCard(List<CardModel> listCard){
        this.listCard= listCard;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public PaymentCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_payment,parent,false);
        return new PaymentCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentCardViewHolder holder, int position) {
        CardModel cardModel = listCard.get(position);
        if(cardModel == null){
            return;
        }
        holder.tvName.setText(cardModel.getNameCard());
        holder.tvNumber.setText(cardModel.getNumberCard());
        holder.tvExpireDate.setText(cardModel.getExpireDate());
    }

    @Override
    public int getItemCount() {
        if(listCard!=null){
            return listCard.size();
        }
        return 0;
    }

    public class PaymentCardViewHolder extends RecyclerView.ViewHolder{
        private TextView tvName,tvNumber,tvExpireDate;
        public PaymentCardViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.textview_name_of_payment);
            tvNumber = itemView.findViewById(R.id.textview_number_of_payment);
            tvExpireDate = itemView.findViewById(R.id.textview_expire_date);
        }
    }
}
