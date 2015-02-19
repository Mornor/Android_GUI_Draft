package com.example.celien.gui_draft.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.celien.gui_draft.tabs.TabListCars;
import com.example.celien.gui_draft.tabs.TabOffers;
import com.example.celien.gui_draft.tabs.TabPersonnalSpace;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence titles[];
    int numbOfTabs;


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);
        this.titles = mTitles;
        this.numbOfTabs = mNumbOfTabsumb;

    }

    /**
     * @return the fragment for the every position in the View Pager
      */
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 :
                TabListCars tabListCars = new TabListCars();
                return tabListCars;
            case 1 :
                TabOffers tabOffers = new TabOffers();
                return tabOffers;
            case 2 :
                //TabPersonnalSpace tabPersonnalSpace = new TabPersonnalSpace();
                //return tabPersonnalSpace;
        }
        return null;
    }

    // This method return the titles for the Tabs in the Tab Strip
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    // This method return the Number of tabs for the tabs Strip
    @Override
    public int getCount() {
        return numbOfTabs;
    }
}