
import java.util.Scanner;

public class Busmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your source: ");
        String source=sc.nextLine();
        System.out.println("Enter your destination: ");
        String destination=sc.nextLine();
        System.out.println("Enter the distance between source and destination: ");
        double distance=sc.nextDouble();
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
        System.out.println("Distance: "+distance+" km");
        System.out.println("For AC bus= Rs 3 per km");
        System.out.println("For Non AC bus= Rs 2 per km");
        Bus b = new Bus(source, destination, distance);
        b.busidgenerator();
        b.busfarecalculator();

    }
}
 class Bus{
    String source;
    String destination;
    double distance;
    int acfare = 3;
    int nacfare = 2;
    String busId;
    
    Bus(String source, String destination, double distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.busId = generateBusId();
    }
    
    private String generateBusId() {
        return source.substring(0, 1) + source.substring(1, 2).toLowerCase() + 
               source.substring(2, 3).toUpperCase() + "-" +
               destination.substring(0, 1) + destination.substring(1, 2).toLowerCase() + 
               destination.substring(2, 3).toUpperCase();
    }
    void busidgenerator() {
        System.out.println("BUS_ID: " + busId);
    }
    void busfarecalculator(){
        System.out.println("BUS_FARE: For AC -> "+distance+"*"+acfare+"="+distance*acfare+","+"For NONAC -> "+distance+"*"+nacfare+"="+distance*nacfare);
    }


}
