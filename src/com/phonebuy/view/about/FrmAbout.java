package com.phonebuy.view.about;

import android.app.Activity;
import android.os.Bundle;
import com.phonebuy.R;

public class FrmAbout extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initComponents();
	}
	
	private void initComponents() {
		setContentView(R.layout.lyt_about); 
		setTitle(R.string.lblTtileAbout);
	}
}
