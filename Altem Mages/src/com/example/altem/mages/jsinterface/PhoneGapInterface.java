package com.example.altem.mages.jsinterface;

import java.util.ArrayList;

import org.apache.cordova.DroidGap;

import android.webkit.WebView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public abstract class PhoneGapInterface {
	private WebView mAppView;
	  private DroidGap mGap;
	  
	public PhoneGapInterface(DroidGap droidGap, WebView view)
	{
		this.mGap = droidGap;
		this.mAppView = view;
	}
	public void submitForm(String jsonString){
		Gson gson = new Gson();
		 JsonParser parser = new JsonParser();
		 JsonArray array = parser.parse(jsonString).getAsJsonArray();
		 ArrayList<NameValuePair> pairList = new ArrayList<NameValuePair>();
		for(int i =0;i<array.size();i++)
		{
			NameValuePair pair = gson.fromJson(array.get(i), NameValuePair.class);
			pairList.add(pair);
		}
		
		processForm(pairList);
	}
	
	public String toJSONString(Object o){
		Gson gson = new Gson();
		return gson.toJson(o);
	}
	
	public abstract void processForm(ArrayList<NameValuePair> pairList);
}
