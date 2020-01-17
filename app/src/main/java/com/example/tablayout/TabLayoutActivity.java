package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tablayout.Fragment.FirstFragment;
import com.example.tablayout.Fragment.SecondFragment;
import com.example.tablayout.Fragment.ThirdFragment;
import com.google.android.material.tabs.TabLayout;

public class TabLayoutActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.view_pager);
        setTabLayout();

    }

    public void setTabLayout(){
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(),"First");
        adapter.addFragment(new SecondFragment(),"Second");
        adapter.addFragment(new ThirdFragment(),"Third");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
