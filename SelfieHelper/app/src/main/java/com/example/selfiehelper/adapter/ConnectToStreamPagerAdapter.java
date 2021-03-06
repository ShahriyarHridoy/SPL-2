package com.example.selfiehelper.adapter;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.Fragment;


import java.util.HashMap;

import com.example.selfiehelper.ui.fragment.QrCodeScannerFragment;
import com.example.selfiehelper.ui.fragment.WriteIpAddressFragment;


public class ConnectToStreamPagerAdapter extends FragmentPagerAdapter {
    private static final int CONNECT_TO_STREAM_PAGES = 2;
    private HashMap<Integer, Fragment> fragmentHashMap = new HashMap<>();

    public ConnectToStreamPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WriteIpAddressFragment();
            case 1:
                return new QrCodeScannerFragment();

            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return CONNECT_TO_STREAM_PAGES;
    }
}
