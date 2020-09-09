import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapL {
	 static PriorityQueue<Integer> highers = new PriorityQueue<>();
	 
	    public static void main(String[] args) throws IOException {
	    	System.out.println(highers  + " : Size" + highers.size());
	    	highers.add(12);
	    	highers.add(4);
	    	highers.add(5);
	    	highers.add(3);
	    	highers.add(8);
	    	highers.add(7);
	    	System.out.println(highers  + " : Size" + highers.size());
	    	highers.poll();
	    	System.out.println(highers  + " : Size" + highers.size());
	    	
	    	System.out.println( "peek " + highers.peek());
	    	System.out.println(highers  + " : Size" + highers.size());
	    	highers.remove(4);
	    	System.out.println(highers  + " : Size" + highers.size());
	    }
}
