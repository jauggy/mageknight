package com.example.altem.mages;

import org.apache.cordova.DroidGap;

import com.example.altem.mages.jsinterface.PhoneGapInterface;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity1 extends DroidGap {
	private PhoneGapInterface jsInterface;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.init();
        jsInterface = new PhoneGapInterface(this, this.appView);
        appView.addJavascriptInterface(jsInterface, "PhoneGapInterface");
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_activity1, menu);
        return true;
    }

    
}
