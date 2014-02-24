package cn.ac.ict.chengenbao.gamestragies.model;

import java.util.List;

import cn.ac.ict.chengenbao.gamestragies.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BrowseApplicationInfoAdapter extends BaseAdapter {
	private List<AppInfo> listAppInfo = null;
	LayoutInflater inflater = null;
	
	public BrowseApplicationInfoAdapter(Context context, List<AppInfo> apps) {
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		listAppInfo = apps;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listAppInfo.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return listAppInfo.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.list_item, null);
		AppInfo app = listAppInfo.get(arg0);
		ImageView icon = (ImageView) view.findViewById(R.id.appIcon);
		TextView appName = (TextView) view.findViewById(R.id.appName);
		icon.setImageDrawable(app.getAppIcon());
		appName.setText(app.getAppLabel());
		
		return view;
	}

}
