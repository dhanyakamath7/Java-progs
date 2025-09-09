package transport; 
 
public class Ebike extends Bicycle { 
    private int battery; 
 
 public Ebike(String id,int battery) { 
  super(id); 
  // TODO Auto-generated constructor stub 
   this.battery = battery;  
   System.out.println("EBike() constructor called"); 
 } 
  @Override 
  public void delivery(String item, String place )  
  { 
         System.out.println("Checking battery: " + battery+ "%"); 
         super.delivery( item, place ); 
  } 
          
 
} 
