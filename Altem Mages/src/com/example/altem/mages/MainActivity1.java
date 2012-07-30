package com.example.altem.mages;

import org.apache.cordova.DroidGap;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.Menu;

import com.example.altem.mages.jsinterface.JSInterfaceBase;

public class MainActivity1 extends DroidGap {
	private JSInterfaceBase jsInterface;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.init();
        AssetManager  am = getResources().getAssets();
        jsInterface = new JSInterfaceBase(this, this.appView, am);
        appView.addJavascriptInterface(jsInterface, "PhoneGapInterface");
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_activity1, menu);
        return true;
    }

    
}
