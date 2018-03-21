// A simple class to test out EGit
public class HelloWorld {
	// Define what will be printed to the screen when it runs
	final static String WHAT_TO_PRINT = "Hello World!  I have made some changes..." ;

	// The main routine
	public static void main(String[] args) {
		// Construct an instance of the class
		HelloWorld hw = new HelloWorld();
		// Invoke a private method that does what we want to be done
		hw.doIt();
	}
	
	private void doIt() {
		// Print the defined string to show that it works
		System.out.println(WHAT_TO_PRINT);
	}
}
