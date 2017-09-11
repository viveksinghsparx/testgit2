package com.example.sis209.plusdemo;

import java.util.ArrayList;
import java.util.zip.Inflater;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
	ArrayList<String> mylist = new ArrayList<String>();
	private LayoutInflater inflater;
	private ViewHolder vh;
	Context c;

	public MyCustomAdapter(Context c, ArrayList<String> ar) {
		this.c = c;
		mylist = ar;
		inflater = (LayoutInflater) c
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
	}

	public class ViewHolder {
		TextView tv;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mylist.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		vh = new ViewHolder();

		if (convertView == null) {
			convertView = inflater.inflate(R.layout.list_item, null);
			vh.tv = (TextView) convertView.findViewById(R.id.textView1);
			convertView.setTag(vh);
		} else
			vh = (ViewHolder) convertView.getTag();
		String s = mylist.get(position);
		Log.e("family is","" + s);
		vh.tv.setText(s);

		return convertView;

	}
}
