// A simple class to test out EGit
public class HelloWorld {
	// The main routine
	public static void main(String[] args) {
		// Construct an instance of the class
		HelloWorld hw = new HelloWorld();
		// Invoke a private method that does what we want to be done
		hw.doIt();
	}
	
	private void doIt() {
		// Just print something to show that it works
		System.out.println("Hello World!");
	}
}
