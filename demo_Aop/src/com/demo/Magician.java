package com.demo;

import org.springframework.stereotype.Component;

@Component(value="m")
public class Magician {
	public void doMagic(){
	
		System.out.println("abra ka dabra");
	}
public void doEating(){
		System.out.println("eating food");
	}
}
