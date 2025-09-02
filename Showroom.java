package source;

public class Showroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("honda", "Corolla", 18000, 19.5);
        Car c2 = new Car("Toyota", "Civic", 25000, 17.0, "John");
        Car c3 = new Car("kia", "i20", 15000, 25.0);

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();

        c1.setOwnerName("john");  
        c1.updateP(16000);

        System.out.println("After Updates:");
        c1.displayDetails();

        Car.showShowroomName();
        Car.showTotalCars();
    }
}