package com.example.altem.mages.viewmodel;

import java.util.ArrayList;

import com.example.altem.mages.jsinterface.NameValuePair;

public interface IViewModel {
	public void onLoad();
	public String getHtmlFilename();
	public String getJSON();
	public IViewModel getNextView();
	public void onSubmitForm(ArrayList<NameValuePair> pairList);
}
