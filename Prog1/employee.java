public class employee { 
		 String name; 
		 int id; 
		 double salary; 
		 employee(String name,int id,double salary){ 
		  this.name=name; 
		  this.id=id; 
		  this.salary=salary; 
		 } 
		 void displayDetails() 
		 { 
		  System.out.println("Employee ID:"+id); 
		  System.out.println("NAME:"+name); 
		  System.out.println("SALARY"+salary); 
		  System.out.println("DETAILS"); 
		 } 
		 void increaseSalary(double percentage) { 
		  double increment=(salary*percentage)/100; 
		  salary=salary+increment; 
		  System.out.println(name+"s salary increased by"+percentage+"%"); 
		   
		 } 
		 
		} 


