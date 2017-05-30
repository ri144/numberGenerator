package numberGen;

import java.util.Random;

public class Main {

	public static void main(String[] args)
    {
        output("Generate a random integer between 5 and 95");

        Random rnd = new Random();
        
        
        int randomInt = 5 + rnd.nextInt(91);
        System.out.println("Generated number: " + randomInt);
        
    
        System.out.println("Done.");
    }
	
	private static void output(String aMessage)
	  {
	    System.out.println(aMessage);
	  }

}
