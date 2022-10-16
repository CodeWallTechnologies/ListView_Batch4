package com.testing.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    List<Person> list;
    Context context;

    public MyAdapter(List<Person> personList,Context ctx) {
        this.list = personList;
        this.context = ctx;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_view,parent,false);

        TextView name = view.findViewById(R.id.textView);
        TextView email = view.findViewById(R.id.textView2);
        Person currentObject = list.get(position);
        name.setText(currentObject.name);
        email.setText(currentObject.gmail);
        return view;
    }
}
