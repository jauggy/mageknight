package com.example.altem.mages.jsinterface;

import java.util.ArrayList;

import org.apache.cordova.DroidGap;

import android.webkit.WebView;

public class MainJSInterface extends PhoneGapInterface{

	public MainJSInterface(DroidGap droidGap, WebView view) {
		super(droidGap, view);
		// TODO Auto-generated constructor stub
	}
	
	public String getNextViewToLoad(){
		return null;
	}

	@Override
	public void processForm(ArrayList<NameValuePair> pairList) {
		// TODO Auto-generated method stub
		
	}

}
