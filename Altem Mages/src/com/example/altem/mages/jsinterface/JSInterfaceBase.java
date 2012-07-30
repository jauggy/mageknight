package com.example.altem.mages.jsinterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.cordova.DroidGap;

import android.content.res.AssetManager;
import android.util.Log;
import android.webkit.WebView;

import com.example.altem.mages.viewmodel.IViewModel;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class JSInterfaceBase {
	private WebView mAppView;
	  private DroidGap mGap;
	  private IViewModel currentViewModel;
	  private AssetManager assetManager;
	  
	public JSInterfaceBase(DroidGap droidGap, WebView view, AssetManager am)
	{
		this.mGap = droidGap;
		this.mAppView = view;
		this.assetManager = am;
	}

//---------------- CALLED BY JQUERY-------------------------	
	public String onLoad(){
		currentViewModel.onLoad();
		return currentViewModel.getJSON();
	}

	public String getHtmlFileName(){
		InputStream inputStream = null;
    try {
        inputStream = assetManager.open("www/cardview.html");
            if ( inputStream != null)
                Log.d("Tag", "It worked!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    	return convertStreamToString(inputStream);
	}

	public IViewModel onSubmitForm(String jsonString){
		Gson gson = new Gson();
		 JsonParser parser = new JsonParser();
		 JsonArray array = parser.parse(jsonString).getAsJsonArray();
		 ArrayList<NameValuePair> pairList = new ArrayList<NameValuePair>();
		for(int i =0;i<array.size();i++)
		{
			NameValuePair pair = gson.fromJson(array.get(i), NameValuePair.class);
			pairList.add(pair);
		}
		
		currentViewModel.onSubmitForm(pairList);		
		currentViewModel = currentViewModel.getNextView();
		return currentViewModel;
	}
	
	private String toJSONString(Object o){
		Gson gson = new Gson();
		return gson.toJson(o);
	}
	
	private String readFile(String path) throws IOException {
		  FileInputStream stream = new FileInputStream(new File(path));
		  try {
		    FileChannel fc = stream.getChannel();
		    MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
		    /* Instead of using default, pass in a decoder. */
		    return Charset.defaultCharset().decode(bb).toString();
		  }
		  finally {
		    stream.close();
		  }
		}
	
	private String convertStreamToString(java.io.InputStream is) {
	    try {
	        return new java.util.Scanner(is).useDelimiter("\\A").next();
	    } catch (java.util.NoSuchElementException e) {
	        return "";
	    }
	}
	

}
