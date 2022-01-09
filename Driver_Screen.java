package cat210;
//driver class to test the functionality of the screen class 


public class Driver_Screen extends Screen {
  // generate a constructor to initialize the values in the screen class 
	public Driver_Screen(String resolution, int refreshRate, int responseTime) {
		//super method to call the variables initialized in the super class(SCreen)
		super(resolution, refreshRate, responseTime);
		 
	}
	public static void main(String args[]) {
		Driver_Screen sc = new Driver_Screen("500 X 700", 50 , 30);
	System.out.println(	sc.toString());
	}
	

}
