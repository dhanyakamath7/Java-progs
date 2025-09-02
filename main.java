

public class Main {

	public static void main(String[] args) {
	
		Employee e1=new Employee("joy",121,10000);
		Employee e2=new Employee("jesna",122,15000);
		System.out.println("initial employee details");
		e1.displayDetails();
		e2.displayDetails();
		e1.increaseSalary(10);
		e2.increaseSalary(10);
		System.out.println("updated employee detais :");
		e1.displayDetails();
		e2.displayDetails();

		

	}
}

	}

}
