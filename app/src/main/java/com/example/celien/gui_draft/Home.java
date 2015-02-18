package com.example.celien.gui_draft;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import com.example.celien.gui_draft.adapter.ViewPagerAdapter;
import com.example.celien.gui_draft.tabs.SlidingTabLayout;


public class Home extends ActionBarActivity {

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence titles[];
    int nbTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    private void init(){
        nbTabs = 3;
        titles = new CharSequence[]{"Cars", "Offers", "Account"};
        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), titles, nbTabs);
        pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(adapter);
        tabs = (SlidingTabLayout)findViewById(R.id.tabs);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });
        tabs.setViewPager(pager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
