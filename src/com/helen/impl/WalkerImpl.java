package com.helen.impl;

import com.helen.Dog;
import com.helen.Nursery;
import com.helen.Walker;

/**
 * 
 * @author Helen
 *
 */
public class WalkerImpl implements Walker {
    
	private int capacityLeft;
   	private int weightLeft;   	
   	private Dog[] dogs;
   	private int nextDogIndex;
	
   	public WalkerImpl(int maxCapacity, int maxWeight) {
		this.capacityLeft = maxCapacity;
		this.weightLeft = maxWeight;   	
		this.dogs = new Dog[this.capacityLeft];
		this.nextDogIndex = 0;
	}
	
	@Override
	public int getCapacityLeft() {
	  			
		return this.capacityLeft ;
	}

	@Override
	public int getWeigthLeft() {
		
		return this.weightLeft;
	}

	@Override
	public void accept(Dog[] dogsToAccept) {
		for (int i=0; i < dogsToAccept.length; i++){
			Dog nextDogToAccept = dogsToAccept[i];
			this.validateCanCarry(nextDogToAccept);
			accept(nextDogToAccept);
		}
	}

	/**
	 * @param nextDogToAccept
	 */
	private void accept(Dog nextDogToAccept) {
		this.dogs[this.nextDogIndex] = nextDogToAccept;
		this.nextDogIndex++;
		this.capacityLeft--;
		this.weightLeft = weightLeft - nextDogToAccept.getWeight();
	}

	/**
	 * Checks if the walker will be able to carry this extra dog
	 * @param dog
	 */
	private void validateCanCarry(Dog dog) throws IllegalStateException {
		if ( this.getCapacityLeft() <= 0 ) {// there can be no more dogs...) {
			throw new IllegalStateException("There is no space for this dog.");
		}
		if ( this.weightLeft - dog.getWeight() < 0 ) {// there is not enough weight capacity left for this dog) {
			String errorMsg = "Dog weights " + dog.getWeight() + 
				" but the walker can only carry " + this.capacityLeft + " more.";
			throw new IllegalStateException(errorMsg);
		}
	}

	@Override
	public void returnDogs(Nursery nursery) {
		
	}

	
}
