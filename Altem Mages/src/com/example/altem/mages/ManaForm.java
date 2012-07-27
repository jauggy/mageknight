package com.example.altem.mages;

public enum ManaForm {
	Crystal,
	Token,
	Source {
	    public String toString() {
	        return "Source Die";
	    }
	}
}
