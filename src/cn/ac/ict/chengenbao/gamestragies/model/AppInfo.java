package cn.ac.ict.chengenbao.gamestragies.model;

import android.content.Intent;
import android.graphics.drawable.Drawable;

public class AppInfo {
	private String appLabel;
	private Drawable appIcon;
	private Intent intent;
	private String pkgName;
	public String getAppLabel() {
		return appLabel;
	}
	public void setAppLabel(String appLabel) {
		this.appLabel = appLabel;
	}
	public Drawable getAppIcon() {
		return appIcon;
	}
	public void setAppIcon(Drawable appIcon) {
		this.appIcon = appIcon;
	}
	public Intent getIntent() {
		return intent;
	}
	public void setIntent(Intent intent) {
		this.intent = intent;
	}
	public String getPkgName() {
		return pkgName;
	}
	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
	}
	

}
