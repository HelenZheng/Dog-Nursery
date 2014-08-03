package com.helen;

/**
 * @author Helen
 *
 */
public interface Walker {

	public int getCapacityLeft();
	
	public int getWeigthLeft();
	
	/**
	 * 
	 * @param dogs
	 * @throws IllegalStateException if the walker has no space for this dog or
	 * can not handle it's weight.
	 */
	public void accept(Dog[] dogs) throws IllegalStateException;
	
	/**
	 * Returns the dogs of this walker to the 
	 * nursery parameter.
	 * @param nursery
	 */
	public void returnDogs(Nursery nursery);
	
}
