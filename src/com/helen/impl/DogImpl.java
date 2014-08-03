package com.helen.impl;

import com.helen.Dog;

public class DogImpl implements Dog {
    
	private int id;
    
	private int weight;
	
	public DogImpl(int theId, int theWeight) {
		this.id = theId;
		this.weight = theWeight;
	}
	
	@Override
	public int getId() {
		return this.id;
	}
	
	@Override
	public int getWeight() {
		return this.weight;
	}
	
	
	public String toString() {
		return "Dog " + this.id + ", weighting " + this.weight;
	}
	
}