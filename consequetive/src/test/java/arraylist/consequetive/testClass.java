package arraylist.consequetive;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.*;

public class testClass {
Logic obj = new Logic();
@Test 
public void testLogic()
{
	Logic obj = new Logic();
	ArrayList<String> givenValue = new ArrayList<String>();
	ArrayList<String> returnedValue = new ArrayList<String>();
	givenValue.add("Saamarth");
	givenValue.add("hello");
	givenValue.add("Friewnds");
	givenValue.add("yoyooooo");
	
	returnedValue.add("Saamarth");
	returnedValue.add("hello");
	returnedValue.add("yoyooooo");
	ArrayList<String> result = obj.getString(givenValue);
	Assert.assertEquals(returnedValue,result);
}
@Test
public void testcase(){
	Logic n = new Logic();
	ArrayList<String> givenValue = new ArrayList<String>();
	ArrayList<String> returnedValue = new ArrayList<String>();
	givenValue.add("1234");
	givenValue.add("1224");
	givenValue.add("Friends");
	givenValue.add("hello");
	returnedValue.add("hello");
	ArrayList<String> result = obj.getString(givenValue);
	Assert.fail("Please enter valid string");
 }


}
