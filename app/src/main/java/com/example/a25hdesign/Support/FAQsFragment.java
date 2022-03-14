package com.example.a25hdesign.Support;

import static com.example.a25hdesign.R.font.jost_light;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a25hdesign.R;
import com.example.a25hdesign.Support.adapter.SupportAdapter;
import com.example.a25hdesign.Support.adapter.SupportFAQsInterface;
import com.example.a25hdesign.Support.model.ItemSupportModel;

import java.util.ArrayList;
import java.util.List;


public class FAQsFragment extends Fragment {
    RecyclerView rcvFAQs;
    SupportAdapter mSupportAdapter;
    View view = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mSupportAdapter = new SupportAdapter(getContext(), new SupportFAQsInterface() {
            @Override
            public void onClickListener(TextView tvTitle, TextView tvContent, ItemSupportModel itemSupportModel) {
                onClickItem(tvTitle, tvContent, itemSupportModel);
            }
        });
        view = inflater.inflate(R.layout.fragment_f_a_qs, container, false);
        rcvFAQs = view.findViewById(R.id.rcv_FAQs);
        rcvFAQs.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rcvFAQs.setLayoutManager(linearLayoutManager);
        rcvFAQs.setAdapter(mSupportAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL);
        rcvFAQs.addItemDecoration(itemDecoration);



        mSupportAdapter.setDataListItem(getListItem());
        return view;
    }

    @SuppressLint("ResourceType")
    private void onClickItem(TextView tvTitle, TextView tvContent, ItemSupportModel itemSupportModel) {
        if (itemSupportModel.isReaded()){
            tvTitle.setTypeface(Typeface.createFromAsset(view.getContext().getAssets(), view.getContext().getResources().getString(R.string.adobe_garamond_pro_bold1)));
            tvContent.setVisibility(View.GONE);
        }else {
            tvTitle.setTypeface(null, Typeface.BOLD);
            tvContent.setVisibility(View.VISIBLE);
        }

        itemSupportModel.setReaded(!itemSupportModel.isReaded());

    }

    private List<ItemSupportModel> getListItem() {
        List<ItemSupportModel> listItem = new ArrayList<>();
        listItem.add(new ItemSupportModel("What is 25Hours?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ", false));
        listItem.add(new ItemSupportModel("What are the benefits?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ", false));
        listItem.add(new ItemSupportModel("I am interested in becoming a member of 25Hours. How do I get it?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ", false));
        listItem.add(new ItemSupportModel("Is there any age limit to become a member?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ", false));
        listItem.add(new ItemSupportModel("How much is the membership fee?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ", false));
        listItem.add(new ItemSupportModel("Can I cancel my membership if I change my mind after signing-up?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ", false));
        listItem.add(new ItemSupportModel("Which email can I contact for inquiries regarding the cessation of my Sky Premium Membership Programme?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ", false));listItem.add(new ItemSupportModel("What is 25Hours?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ",false));
        listItem.add(new ItemSupportModel("Will 25Hours offer the same products and services that Sky Premium had?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ", false));
        listItem.add(new ItemSupportModel("Can I attend all events with the membership?","25Hours exists as a solution for the modern, time-pressured individuals — products, services, people, experiences, and entertainment of the utmost quality that are meticulously selected to ensure that members are spending their precious spare time on nothing but enjoying the best that the world has to offer. ", false));

        return listItem;

    }
}