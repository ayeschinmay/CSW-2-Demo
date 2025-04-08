package harsh;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		details op= new details();
		op.busidgenerator();
		op.BUS_FARE();	
	}
}
class details{
	int BUS_ID;
	int BUS_FARE;
	Scanner sc= new Scanner(System.in);
	public void busidgenerator() {
		System.out.println("Source - ");
		String s= sc.next();
		System.out.println("Destination - ");
		String d= sc.next();
		System.out.println("BUS_ID is "+ s.substring(0,3)+"-"+d.substring(0,3));
	}
	public void BUS_FARE() {
		int fare;
		System.out.println("Distance (IN KM) - ");
		int d= sc.nextInt();
		System.out.println("Enter 1 for AC BUS and 0 for NON-AC BUS- ");
		int x=sc.nextInt();
		if(x==1) 
			fare= 3*d;
		else
			fare=2*d;
		System.out.println("BUS_FARE : "+ fare);		
	}
}


