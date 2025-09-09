package transport; 
 
public class Main { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
    Ebike e = new Ebike("EB-101", 50 ); 
         e.delivery("Sandwich", "Library" ); 
         Drone d = new Drone("DR-1" ); 
         d.delivery("Notes", "ExamCell" );    
         d.delivery("USB", "CSE Block" );  
           double bill = d.cost( 5 ); 
                 System.out.println("Drone delivery cost: Rs." + bill ); 
 
   
 
 } 
 
}
