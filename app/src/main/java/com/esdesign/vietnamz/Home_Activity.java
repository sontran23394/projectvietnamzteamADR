package com.esdesign.vietnamz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.esdesign.vietnamz.Home_Ativity.Detail_Area;
import com.esdesign.vietnamz.Home_Ativity.GridviewAdapter;
import com.esdesign.vietnamz.Home_Ativity.GridviewEntity;

import java.util.ArrayList;

public class Home_Activity extends Activity {

    private GridView gridview;
    private ArrayList<GridviewEntity> arraydata;
    private GridviewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        gridview = (GridView) findViewById(R.id.gridview_homeActivity);
        arraydata = getData();
        adapter = new GridviewAdapter(arraydata,this);
        gridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        gridview.setOnItemClickListener(itemgridClick);
    }

    private AdapterView.OnItemClickListener itemgridClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent detail = new Intent(getApplication(),Detail_Area.class);
            startActivity(detail);
        }
    };
    private ArrayList<GridviewEntity> getData()
    {
        ArrayList<GridviewEntity> data = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            GridviewEntity gr;
            if(i%2==0)
                gr = new GridviewEntity("Sapa","Lao Cai - Việt Nam",R.drawable.sapa);
            else
                gr = new GridviewEntity("Mai Châu","Hòa Bình - Việt Nam",R.drawable.maichau);
            data.add(gr);
        }
        return data;
    }
}
