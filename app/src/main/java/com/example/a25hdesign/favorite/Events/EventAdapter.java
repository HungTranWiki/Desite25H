package com.example.a25hdesign.favorite.Events;

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

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.evenViewHolder> {
    private Context mContext;
    private List<EventsModel> mListEvent;

    public EventAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setDataEvent(List<EventsModel> listEvent){
        this.mListEvent = listEvent;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public evenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.events_item_view,parent,false);
        return new evenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull evenViewHolder holder, int position) {
        EventsModel eventsModel = mListEvent.get(position);
        if(eventsModel == null){
            return;
        }
        holder.imgLogo.setImageResource(eventsModel.getEventLogo());
        holder.tvEventName.setText(eventsModel.getEventName());
        holder.tvEventStatus.setText(eventsModel.getStatus());
        holder.tvEventDatetime.setText(eventsModel.getEventDateTime());
        holder.tvEvenDecs.setText(eventsModel.getDesc());

    }

    @Override
    public int getItemCount() {
        if(mListEvent!= null){
            return mListEvent.size();
        }
        return 0;
    }

    public class evenViewHolder extends RecyclerView.ViewHolder{
        ImageView imgLogo;
        TextView tvEventName;
        TextView tvEventStatus;
        TextView tvEventDatetime;
        TextView tvEvenDecs;

        public evenViewHolder(@NonNull View itemView) {
            super(itemView);

            imgLogo = itemView.findViewById(R.id.imageLogo_event);
            tvEventName = itemView.findViewById(R.id.textview_name_event);
            tvEventStatus = itemView.findViewById(R.id.textview_status_event);
            tvEventDatetime = itemView.findViewById(R.id.textview_date_time_event);
            tvEvenDecs = itemView.findViewById(R.id.textview_desc_event);

        }
    }
}
