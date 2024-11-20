
package vehiclainfo;


public class VehiclaInfo {

 public static void main(String[] args) {
    carInfo car1=new carInfo();
    BusInfo bus1=new BusInfo();
    
    car1.Car_Price="1000000";
    car1.car_type="4 wheel";
    car1.car_model="Mark2_JZX100";
    car1.Personal_Car="Private_Car";
    car1.Manufacturing_Year=2000;
    car1.country="japan";
    car1.displayInfo();
    car1.displayInfo2();
    
    bus1.Car_Price="5000000";
    bus1.Manufacturing_Year=2005;
    bus1.Seat_Number="1";
    bus1.car_model="AK1J";
    bus1.car_type="10 wheeler";
    bus1.country="Japan";
    bus1.displayInfo();
    bus1.diplayInfo3();
    }
    
}
