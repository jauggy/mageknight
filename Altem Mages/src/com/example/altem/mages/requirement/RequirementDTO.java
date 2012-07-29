package com.example.altem.mages.requirement;

import com.example.altem.mages.IUniqueNameable;

public class RequirementDTO {
	public RequirementDTO(String uniqueName, String displayLabel, IUniqueNameable[] s){
		
		this.displayLabel = displayLabel;
		this.uniqueName = uniqueName;
		selectables = new SelectableDTO[s.length];
		for(int i =0;i<s.length;i++){
			selectables[i] = new SelectableDTO(s[i].getUniqueName(), s[i].getDisplayLabel());
		}
	}
	private String uniqueName;
	private SelectableDTO[] selectables;
	private String displayLabel;

	
}
