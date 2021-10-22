import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

class Car{
	float total_miles_driven_perday,Costper_gallon_of_gasoline,Average_miles_per_gallon,Parking_fees,tolls_perday;
	final float cost_perToll = 55.30f;
	 boolean whilecond = true;
	 Scanner sc = new Scanner(System.in);
	
	public void GetDetail(){
	   System.out.print("Enter total KM driven per day");
	    total_miles_driven_perday = sc.nextFloat();
	   System.out.print("Enter Cost per letter of Petrol");
	    Costper_gallon_of_gasoline = sc.nextFloat();
	   System.out.print("Enter Average KM per Letter");
	    Average_miles_per_gallon = sc.nextFloat();
	   System.out.print("Enter Parking Fees");
	    Parking_fees = sc.nextFloat();
	   System.out.print("Enter tolls per day");
	    tolls_perday = sc.nextFloat();
	}
   public void showCost() {
     
	 float litter= total_miles_driven_perday / Average_miles_per_gallon;
	 float totalcost = litter * Costper_gallon_of_gasoline;
	 
	 
	 while(whilecond) {
		 System.out.println("******************************************************");
		 System.out.println("Press 1 for - Per-Day Cost of Car");
		 System.out.println("Press 2 for - Per-Month Cost of Car");
		 System.out.println("Press 3 for - Per-Year Cost of Car");
		 System.out.println("Press 4 for Exit");
		 System.out.println("******************************************************");
		 int chioce = sc.nextInt();
		 
		 switch(chioce) {
		 
		 case 1:
			 System.out.println("Total Per-Day Cost of Car :" + (totalcost+Parking_fees+(tolls_perday*cost_perToll))+" rs/-");
			 break;
			 
		 case 2:
			 System.out.println("Total Per-Month Cost of Car   :" + (totalcost+Parking_fees+(tolls_perday*cost_perToll))*30 +" rs/-");
		     break;
		 
		 case 3:
			 System.out.println("Total Per-Year Cost of Car   :" + (totalcost+Parking_fees+(tolls_perday*cost_perToll))*365 +" rs/-");
		     break;
		     
		 case 4:
			 exit();
			 break;
			 
		  default:
			  System.out.println("Please Choose Correct Opetion");
			  break;
		     
		 }
		 
	 }
	 
}
   
   void exit() {
	   System.out.println("---------------------------------------------------------------");
	   System.out.println("Successfully Loged out.....");
	   System.out.println("Close the Program");
	   System.out.println("_______________________________________________________________");
	   whilecond = false;
	   
   }
}

public class Total_Car_Cost {
	public static void main(String[] args) {
		Car c = new Car();
		Scanner sc = new Scanner(System.in);
		boolean cond = true;		
		while(cond) {
			System.out.println("|*********************************************************|");
			System.out.println("|             Welcome to Find Tottal Cost of Car          |");
			System.out.println("|_________________________________________________________|");
			System.out.println("|             1 for Find Total Cost of Car                |");
			System.out.println("|             2 for Exit                                  |");
			System.out.println("|_________________________________________________________|");
			int choice = sc.nextInt();	
		switch(choice) {
		
		case 1:
			 c.GetDetail();
			 System.out.println("_____________________________________________");
			 c.showCost();
			 break;
			 
		case 2:
			System.out.println("Exit module is in process ....!");
		    cond = false;
			break;
			
		default:
			System.out.println("Please Choose Correct Option");
			break;			
		}
		}
	}

}
