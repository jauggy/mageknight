package com.example.altem.mages;

public enum ManaForm {
	Crystal,
	Token,
	Source {
	    @Override
		public String toString() {
	        return "Source Die";
	    }
	}
}
