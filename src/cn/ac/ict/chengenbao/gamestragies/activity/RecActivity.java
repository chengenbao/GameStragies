package cn.ac.ict.chengenbao.gamestragies.activity;

import cn.ac.ict.chengenbao.gamestragies.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class RecActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.rec_content);
		WebView recView = (WebView) findViewById(R.id.webView);
		recView.getSettings().setJavaScriptEnabled(true); 
		recView.loadUrl("http://www.baidu.com");
	}
	
}
