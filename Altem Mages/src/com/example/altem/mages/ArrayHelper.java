package com.example.altem.mages;

import java.util.List;

public class ArrayHelper {
	public <T> void getObjectsByClass(List list, Class t){
		
		for(Object o : list){
			if(t.isAssignableFrom(o.getClass())){
				
			}
		}
	}
}
