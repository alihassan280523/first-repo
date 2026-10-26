package Packages;


public class ParkingSystem{

    private String registrationNumber;
    private String name;
    private int entryTime;
    private int exitTime;
    private boolean isParked;

    public ParkingSystem(){
        registrationNumber="ABC-123";
        name="xyz";
        entryTime=-1;
        exitTime=-1;
        isParked=false;
    }

    public ParkingSystem(String regNum,String name,int entryTime){
        this.registrationNumber=regNum;
        this.name=name;
        this.entryTime=entryTime;
        exitTime=-1;
        isParked=true;
    }

    public void setExitTime(int val){

        if(entryTime==-1){
            System.out.println("Car is not yet parked");
            return;
        }

        if(val>0&&val<24){
            exitTime=val;
            isParked=false;
        }
        else{
            System.out.println("Invalid value");
        }

    }

    public int getExitTime(){
        return exitTime;
    }

    public void setRegistration(String regNum){
        registrationNumber=regNum;
    }


    public String getRegistration(){
        return registrationNumber;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setEntryTime(int time){

        if(entryTime!=-1){
            System.out.println("Car is already parked");
            return;
        }

        if(time>0&&time<24){
            entryTime=time;
            isParked=true;
        }
    }

    public int getEntryTime(){
        return entryTime;
    }

    
    @Override
    public String toString(){
        return(
            "Reg Number: "+registrationNumber+
            "\nName: "+name+
            "\nEntry Time: "+entryTime+
            "\nExit Time: "+exitTime+
            "\nParking status: "+(isParked? "Car is parked":"Car is not parked")
        );
    }

}