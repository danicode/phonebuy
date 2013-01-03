package com.phonebuy.view.initial;

import com.phonebuy.R;
import com.phonebuy.view.scan_barcode.FrmScanBarcode;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.app.Activity;
import android.content.Intent;

public class FrmInitial extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initComponents();        
    }
    
    private void initComponents() {
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.lyt_initial);
    }
    
    public void btnLoadCartSetOnClickListener(View button) {
    	Intent intent = new Intent(FrmInitial.this, FrmScanBarcode.class);
    	startActivity(intent);	
    }
    
}
