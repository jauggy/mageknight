package com.example.altem.mages.viewmodel;

import com.example.altem.mages.IUniqueNameable;

public class DTO {
	public DTO(IUniqueNameable unique)
	{
		this.DisplayLabel = unique.getDisplayLabel();
		this.UniqueName = unique.getUniqueName();
	}
	public String DisplayLabel;
	public String UniqueName;
}
