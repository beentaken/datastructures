

import java.util.Map.Entry;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;



public class ConcurrentHashMapL {
	
	 static ConcurrentHashMap<AtomicInteger, String> userHandler = new ConcurrentHashMap<AtomicInteger, String>(); 

		public static void test() {
			userHandler.clear();

			for (int i = 0; i < 10; i++)
			{
				userHandler.put(new AtomicInteger(i), "char " + Integer.toString(i));
//				if(userHandler.contains("char " + Integer.toString(4))) {
//					userHandler.clear();
//				}	
			}
			
		      for (Entry<AtomicInteger, String> entry : userHandler.entrySet())
		      {
		        System.out.println(
		        		Thread.currentThread().getId() + " " + Thread.currentThread().getName() + " - [" + entry.getKey() + ", " + entry.getValue() + ']');
		      }

	
		}



	public static void main(String[] args) {
		test();
		
		System.out.print("");
	
	}

}
