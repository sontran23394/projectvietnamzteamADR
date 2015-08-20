package com.esdesign.vietnamz.Home_Ativity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.esdesign.vietnamz.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by ES on 18/08/2015.
 */
public class GridviewAdapter extends BaseAdapter{
    private ArrayList<GridviewEntity> array;
    private LayoutInflater inflater;
    private TextView name;
    private TextView description;
    private ImageView image;

    public GridviewAdapter(ArrayList<GridviewEntity> array, Context con) {
        this.array = array;
        inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(int i) {
        return array.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
        {
            view = inflater.inflate(R.layout.gridview_home_item,null);
        }

        name = (TextView) view.findViewById(R.id.gridviewName);
        description = (TextView) view.findViewById(R.id.gridviewDescription);
        image = (ImageView) view.findViewById(R.id.gridviewImage);

        GridviewEntity gent = (GridviewEntity) getItem(i);

        name.setText(gent.getName());
        description.setText(gent.getDescription());
        image.setImageResource(gent.getImage());

        return view;
    }
}
