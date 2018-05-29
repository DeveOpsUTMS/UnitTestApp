package example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewTest {

	public int add(int a,int b){
		return a+b;
	}
	
	/*public int divide(int a,int b){
		return a/b;
	}*/
	

	/*@Test
	public void contextLoads() {
		
	}*/
	
	@Test
	public void getPositiveNumber(){
		
		assertEquals(2, add(1,1));
	}
	
	@Test
	public void getNegativeNumber(){
		assertEquals(-2, add(-1,-1));
	}
	
	@Test
	public void getNegativeResult(){
		assertEquals(-1, add(-2,1));
	}
	;
	@Test
	public void getPositiveResult(){
		assertEquals(1, add(2,-1));
	}

}
