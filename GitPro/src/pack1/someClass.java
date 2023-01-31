package pack1;

public class someClass {
	public static MyInterface getMyInterface() {
		return new MyInterface() {

			@Override
			public void disp() {
				// TODO Auto-generated method stub
				System.out.println("inside");
			}
			
		};
	}
}
