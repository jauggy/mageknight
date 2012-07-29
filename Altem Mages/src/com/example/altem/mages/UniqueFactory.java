package com.example.altem.mages;

import java.util.HashMap;

import com.example.altem.mages.requirement.ManaRequirement;

/*
 * Creates an object and gives it a unique name.
 * The DTO requires unqiue name but not the actual object
 */
public class UniqueFactory {

	HashMap<String, Object> objectMap;
	
	public ManaRequirement createManaRequirement(ManaColor color){
		Mana
	}
	
	public ManaRequirement getManaRequirement(String unique){
		
	}
	
	protected String uniqueName;
	public UniqueNameable(){
		
	}
	
	public String getUniqueName(){
		return uniqueName;
	}
	
	
	private final String PACKAGE_SEPARATOR = ".";
	
	 public  String getShortClassName() {
			String classname =  this.getClass().getName();
		    int idx = classname.lastIndexOf(PACKAGE_SEPARATOR);

		    if (idx != -1)
		      return classname.substring(idx + 1, classname.length());
		    return classname;
		  }
	
}
