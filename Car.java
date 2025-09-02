package source;

public class Car {
	private String b;
	private String m;
	private double p;
	private double mil;
	private String ownerName;
	private static int totalCars;
	private static  String showroomName="kia motors";
	public Car(String b,String m,double p,double mil) {
		this.b=b;
		this.m=m;
		this.p=p;
		this.mil=mil;
		ownerName="john";
		totalCars++;
	}
	public Car(String b,String m,double p,double mil,String ownerName) {
		this.b=b;
		this.m=m;
		this.p=p;
		this.mil=mil;
		this.ownerName=ownerName;
		totalCars++;
		}
	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String owner) {
		ownerName=owner;
	}
	public void displayDetails() {
		System.out.println("Brand:"+this.b);
		System.out.println("Model"+this.m);
		System.out.println("price"+this.p);
		System.out.println("mileage"+this.mil);
		System.out.println("owner"+this.ownerName);
	}
	public void updateP(double newP) {
		this.p=newP;
		
	}
	public static void showTotalCars() {
		System.out.println("totalCars:"+totalCars);
	}
	public static void showShowroomName() {
		System.out.println("Showroom:"+showroomName);
	}
	
	
}