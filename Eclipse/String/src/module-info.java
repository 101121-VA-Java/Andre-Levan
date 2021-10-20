public class stringDrive{
	
	public static main(String[] args) {
	/*
	 * Using StringBuilder and its associated methods (if needed), 
	 * create a method that removes every other letter of a String passed in 
	 * and return that newly created string.
	 */

		StringBuilder sb = new StringBuilder("Hello world!");
		
		System.out.println(sb.reverse());
		
		//generally use string builder
		StringBuffer sbuff = new StringBuffer("Hello");
		
		StringDriver sd = new StringDriver();
		
		System.out.println(sd.removeEveryOtherLetter("Hello World!"));
	 
	}    
	//create a string method
	public String removeEveryOtherLetter(String string) 
	{
		//create new object called result
		String result = new String("");
		//create a loop to move letters
		for(int i =0; i < string.length(); i++;) 
		{
			if(i % 2 == 0)
			{
				result += string.charAt(i);
			}
		}
		
		//return string
		return result;
		  
	  }

	/*
	 * Given the string of a url of the format localhost:3500/[controller]/[resource]
	 * where "localhost:3500" is a constant
	 * controller and resource can be any 1 word
	 * return the value of controller as a string
	 */
	public String getControllerValue(String url) {
		return null;
	}
}