package com.demo5;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Country {
	private String countryName;
	
	private Map<String, statesDetails> states;

	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	

	public void setStates(Map<String, statesDetails> states) {
		this.states = states;
	}
	
public void printCountryDetails(){
	
	System.out.println("country name :"+countryName);
	Set<Entry<String,statesDetails>> enteryset=states.entrySet();
	for(Entry<String,statesDetails>e: enteryset){
		System.out.println(e.getKey()+":"+e.getValue());
	}
	
	
}


	
	
	
	
	

}
