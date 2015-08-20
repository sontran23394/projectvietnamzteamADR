package com.esdesign.vietnamz;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitTabhost();
    }

    private void InitTabhost()
    {
        TabHost tabhost = getTabHost();
        TabHost.TabSpec homespec = tabhost.newTabSpec("Home");
        homespec.setIndicator(null, getResources().getDrawable(R.drawable.homeicon));
        Intent homeIntent = new Intent(this, Home_Activity.class);
        homespec.setContent(homeIntent);

        TabHost.TabSpec menuspec = tabhost.newTabSpec("Menu");
        menuspec.setIndicator(null, getResources().getDrawable(R.drawable.backpackicon));
        Intent MenuIntent = new Intent(this, Menu_Activity.class);
        menuspec.setContent(MenuIntent);

        TabHost.TabSpec navigationspec = tabhost.newTabSpec("Localtion");
        navigationspec.setIndicator(null, getResources().getDrawable(R.drawable.navigation));
        Intent navigationIntent = new Intent(this, Localtion_Activity.class);
        navigationspec.setContent(navigationIntent);

        TabHost.TabSpec servicespec = tabhost.newTabSpec("Service");
        servicespec.setIndicator(null, getResources().getDrawable(R.drawable.servises));
        Intent serviceIntent = new Intent(this, Service_Activity.class);
        servicespec.setContent(serviceIntent);

        tabhost.addTab(homespec);
        tabhost.addTab(menuspec);
        tabhost.addTab(navigationspec);
        tabhost.addTab(servicespec);
    }
}
