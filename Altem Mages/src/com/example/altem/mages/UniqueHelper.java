package com.example.altem.mages;

import java.util.ArrayList;
import java.util.Collection;

import com.example.altem.mages.viewmodel.DTO;

public final class UniqueHelper {

	public static UniqueNameable getMatch(String uniqueName, Collection c){
		for(Object o: c){
			if(o instanceof UniqueNameable){
				UniqueNameable un = (UniqueNameable) c;
				if(un.getUniqueName().equals(uniqueName))
					return un;
			}
		}
		
		return null;
	}
	
	public static DTO[] toDTOArray(Collection c){
		return null;
	}

	public static DTO[] toDTOArray(IUniqueNameable[] selectables) {
		// TODO Auto-generated method stub
		return null;
	}
}
