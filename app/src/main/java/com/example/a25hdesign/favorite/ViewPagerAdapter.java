package com.example.a25hdesign.favorite;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.a25hdesign.favorite.Events.EventsFragment;
import com.example.a25hdesign.favorite.Privileges.PrivilegesFragment;
import com.example.a25hdesign.favorite.shop.ShopFragment;


public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ShopFragment();
            case 1:
                return new EventsFragment();
            case 2:
                return new PrivilegesFragment();
            default:
                return new ShopFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
