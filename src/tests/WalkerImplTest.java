package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.helen.Dog;
import com.helen.Walker;
import com.helen.impl.DogImpl;
import com.helen.impl.WalkerImpl;

public class WalkerImplTest {

	@Test( expected = IllegalStateException.class )
	public void testWalkerAcceptingMoreHeCanChew() {
		Walker w = new WalkerImpl(2,  100);
		Dog dogPeter = new DogImpl(1214144, 2);
		Dog dogDamp = new DogImpl(1231, 5);
		Dog dogFucker = new DogImpl(3, 5);
		
		//Dog[] myDogs = new Dog[] {dogPeter, dogDamp};
		Dog[] myDogs = new Dog[3];
		myDogs[0] = dogPeter;
		myDogs[1] = dogDamp;
		myDogs[2] = dogFucker;
		
		w.accept(myDogs);
		
		
	}
	
	@Test
	public void testCapacityLeftWorks() {
		Walker w = new WalkerImpl(5,  100);
		Dog dogPeter = new DogImpl(1214144, 2);
		Dog dogDamp = new DogImpl(1231, 5);
		
		//Dog[] myDogs = new Dog[] {dogPeter, dogDamp};
		Dog[] myDogs = new Dog[2];
		myDogs[0] = dogPeter;
		myDogs[1] = dogDamp;
		
		w.accept(myDogs);
		
		assertEquals(3, w.getCapacityLeft());
	}

	@Test
	public void testWeightLeftWorks() {
		Walker w = new WalkerImpl(5,  100);
		Dog dogPeter = new DogImpl(1214144, 2);
		Dog dogDamp = new DogImpl(1231, 5);
		
		//Dog[] myDogs = new Dog[] {dogPeter, dogDamp};
		Dog[] myDogs = new Dog[2];
		myDogs[0] = dogPeter;
		myDogs[1] = dogDamp;
		
		w.accept(myDogs);
		
		assertEquals(93, w.getWeigthLeft());
	}
}
