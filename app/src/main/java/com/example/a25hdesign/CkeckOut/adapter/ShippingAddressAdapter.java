package com.example.a25hdesign.CkeckOut.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a25hdesign.CkeckOut.model.ShippingAddressModel;
import com.example.a25hdesign.R;

import java.util.List;

public class ShippingAddressAdapter extends RecyclerView.Adapter<ShippingAddressAdapter.ShippingViewHolder>{
    List<ShippingAddressModel> listAddress;

    public ShippingAddressAdapter(List<ShippingAddressModel> listAddress) {
        this.listAddress = listAddress;
    }

    public void SetDataListAddress(List<ShippingAddressModel> listAddress){
        this.listAddress= listAddress;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ShippingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shipping_address,parent,false);
        return new ShippingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShippingViewHolder holder, int position) {
        ShippingAddressModel shippingAddressModel = listAddress.get(position);
        if(shippingAddressModel == null){
            return;
        }
        holder.tvName.setText(shippingAddressModel.getName());
        holder.tvAddress.setText(shippingAddressModel.getAddress());
        holder.tvNationCode.setText(shippingAddressModel.getNationCode());
    }

    @Override
    public int getItemCount() {
        if(listAddress!=null){
            return listAddress.size();
        }
        return 0;
    }

    public class ShippingViewHolder extends RecyclerView.ViewHolder{
        TextView tvName,tvAddress,tvNationCode;
        public ShippingViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.textview_name_of_address);
            tvAddress = itemView.findViewById(R.id.textview_address);
            tvNationCode = itemView.findViewById(R.id.textview_nation_code);
        }
    }

}
