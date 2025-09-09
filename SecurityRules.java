package transport; 
 
public final class SecurityRules { 
 private SecurityRules() { 
   
 } 
 public static boolean canfly(String place) { 
  return!place.equals("Examcell"); 
 } 
 
}