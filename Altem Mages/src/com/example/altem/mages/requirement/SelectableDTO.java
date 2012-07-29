package com.example.altem.mages.requirement;

public class SelectableDTO {
	private String uniqueName;
	private String displayLabel;
	public SelectableDTO(String uniqueName, String displayLabel){
		this.displayLabel = displayLabel;
		this.uniqueName = uniqueName;
	}
	public String getUniqueName() {
		return uniqueName;
	}
	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}
	public String getDisplayLabel() {
		return displayLabel;
	}
	public void setDisplayLabel(String displayLabel) {
		this.displayLabel = displayLabel;
	}
}
