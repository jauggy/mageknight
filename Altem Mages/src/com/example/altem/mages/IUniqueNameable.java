package com.example.altem.mages;

import com.example.altem.mages.viewmodel.DTO;

public interface IUniqueNameable {
	public String getUniqueName();
	public String getDisplayLabel();
	public DTO toDTO();
}
