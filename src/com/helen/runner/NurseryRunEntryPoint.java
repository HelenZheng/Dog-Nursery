package com.helen.runner;

import com.helen.Dog;
import com.helen.Nursery;
import com.helen.impl.DogImpl;
import com.helen.impl.NurseryImpl;

public class NurseryRunEntryPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Nursery nur = new NurseryImpl(30);
		Dog aDog = new DogImpl(4, 34); 
		aDog.getId();
		aDog.getWeight();
		nur.leave(aDog);
		
	}

}
