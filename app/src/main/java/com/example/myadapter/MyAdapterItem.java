package com.example.myadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapterItem extends BaseAdapter {
    Context context;
    ArrayList data;

    public MyAdapterItem(Context context,ArrayList data){
        this.context=context;
        this.data=data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null){
            view= LayoutInflater.from(context)
                    .inflate(android.R.layout.simple_list_item_1,null);
            TextView tv = view.findViewById(android.R.id.text1);
            String txt = getItem(i).toString();
            tv.setText(txt);
        }
        return view;
    }
}
