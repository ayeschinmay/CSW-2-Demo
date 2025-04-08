package test;

import java.util.Scanner;

class Bus {
    private String src;
    private String dest;
    private int dis;
    private String busid;

    public Bus(String src, String dest, int dis) {
        this.src = src;
        this.dest = dest;
        this.dis = dis;
        this.busid = busidgenerator();
    }

    private String busidgenerator() {
        String srccode = src.substring(0, 3).toUpperCase();
        String destcode = dest.substring(0, 3).toUpperCase();
        
        srccode =srccode.substring(0,1).toUpperCase()+srccode.substring(1,2).toLowerCase()+srccode.substring(2,3).toUpperCase() ;       
        destcode =destcode.substring(0,1).toUpperCase()+destcode.substring(1,2).toLowerCase()+destcode.substring(2,3).toUpperCase() ;
        
        return srccode + "-" + destcode;
    }

    public void busfaregenerator() {
        int acFare = dis * 3;
        int nonAcFare = dis * 2;

        System.out.println("Bus id: " + busid);
        System.out.println("Bus fare for ac bus: " + acFare);
        System.out.println("for nac bus: " + nonAcFare);
    }
}

public class april8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source");
        String src = sc.nextLine();

        System.out.println("Enter the destination");
        String dest = sc.nextLine();

        System.out.println("Enter the distance in km");
        int dis = sc.nextInt();

        Bus bus = new Bus(src, dest, dis);

        bus.busfaregenerator();

        sc.close();
    }
}
