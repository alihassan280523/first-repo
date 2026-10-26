import Packages.ParkingSystem;

public class Main{

    public static void main(String[] args) {
        
        ParkingSystem obj=new ParkingSystem("LHR-1234","Ali Hassan",12);

        System.out.println(obj.toString());
        
        
        obj.setExitTime(17);

        System.out.println("\n\n"+obj.toString());

        ParkingSystem obj1=new ParkingSystem();

        System.out.println("\n\n"+obj1.toString());
        obj1.setRegistration("LHR-6789");
        obj1.setName("Farhan");
        obj1.setEntryTime(14);
        obj1.setExitTime(19);
        
        System.out.println("\n\n"+obj1.toString());
    }
}