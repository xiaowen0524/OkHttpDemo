package com.bawei.asus.okhttpdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by asus on 2016/11/4.
 */
public class MyBaseAdapter extends BaseAdapter {
    private List<Tugou> list;
    private Context context;

    public MyBaseAdapter(List<Tugou> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Vhodler vh;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item, null);
            vh = new Vhodler();
            vh.tv = (TextView) convertView.findViewById(R.id.tv);
            convertView.setTag(vh);
        } else {
            vh = (Vhodler) convertView.getTag();
        }
        vh.tv.setText(list.get(position).getDescription());
        return convertView;
    }

    class Vhodler {
        TextView tv;
    }
}
