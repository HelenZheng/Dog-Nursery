package com.helen.impl;

import com.helen.Dog;
import com.helen.Nursery;
import com.helen.Walker;

public class NurseryImpl implements Nursery {

	private Dog[] dogsInCare;
	
	public NurseryImpl(int capacity) {
		this.dogsInCare = new Dog[capacity];
	}

	@Override
	public boolean leave(Dog dog) {
	    // todo auto generated. Change!
		return true;
	}

	@Override
	public Dog pickUp(int dogId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assignDogs(Walker walker) {
		// TODO Auto-generated method stub
		
	}
	
	
}
