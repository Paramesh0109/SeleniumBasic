package seleniumbasic;

public class Hello {
		
	int id=9001;
	String name="Karthick";
	
	public void myid() {
		
		System.out.println("Hi Hello");
		System.out.println("My id is " + id);
	}	
	public void myname() {
		
		System.out.println("My name is " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello sum = new Hello();
		sum.myid();
		sum.myname();
	
	}

}
