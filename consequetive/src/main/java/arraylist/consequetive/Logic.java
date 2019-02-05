package arraylist.consequetive;
import java.util.ArrayList;
import java.util.Iterator;
public class Logic {
	ArrayList<String> result = new ArrayList<String>();
	public  ArrayList<String> getString(ArrayList<String> name) {
		
		for( int i = 0; i<name.size(); i++)
		{
			String name1 = name.get(i);
			for (int j=1 ; j<name1.length(); j++) 
			{
	            if(name1.charAt(j) == name1.charAt(j-1))
	            {
	            	result.add(name1);
	              
	               break;
	            }
	        
	           
			}
		}
		
//		System.out.println(result);
		return result;
			
		}
	

}
