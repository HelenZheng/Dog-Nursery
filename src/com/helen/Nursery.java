package com.helen;


/**
 * 
 * @author Helen
 *
 */
public interface Nursery {

	/**
	 * Leaves the dog in the nursery. If there is no
	 * more space in the nursery the method returns false.
	 * It returns true otherwise.
	 * 
	 * @param dog
	 * @return
	 */
	public boolean leave(Dog dog);
	
	/**
	 * Returns the dog from the nursery removing it.
	 * If there is no dog with such id then null is returned.
	 * 
	 * @param dogId
	 * @return
	 */
	public Dog pickUp(int dogId);
	
	public void assignDogs(Walker walker);
	
}
