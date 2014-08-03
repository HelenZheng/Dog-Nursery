package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.helen.Dog;
import com.helen.impl.DogImpl;

public class DogImplTest {
    
	@Test
	public void testIdInConstructor() {
		int theId = 5;
		int theWeight = 30;
	
		Dog testObject = new DogImpl(theId, theWeight);
		
		assertEquals(theId, testObject.getId());
	}
	
	@Test
	public void testWeightInConstructor() {
		int theId = 5;	
		int theWeight = 30;
		
		Dog testObject = new DogImpl(theId, theWeight);
		
		assertEquals(theWeight, testObject.getWeight());
	}

}
