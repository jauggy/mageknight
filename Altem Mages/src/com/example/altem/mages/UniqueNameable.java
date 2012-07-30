package com.example.altem.mages;

public abstract class UniqueNameable extends GameContextDependent implements IUniqueNameable{
	protected String uniqueName;
	public UniqueNameable(){
		uniqueName = getShortClassName() +" " + this.gameContext.getUniqueCounter(); 
		gameContext.addUniqueNameableToWorld(this);
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
