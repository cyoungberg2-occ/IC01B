/**
   Represents an automobile.
   All vehicles used for transportation in the U.S. must have identification, which varies according to the type of vehicle. 
   For example, all automobiles have a unique Vehicle Identification Number (VIN) assigned by the manufacturer, plus a license plate number assigend 
   by the state in which the auto is registerd.
   Modify the Auto class to include an instance variable for the license plate number. Implement the constructor so that an Auto can be constructed with a
   VIN and a license plate number.
   Override the getID() method to return the id of the auto as shown in this format: VIN=1234567890,plate=ABC123 (without any spaces).
	Complete the following file:
*/

public class Auto extends Vehicle
{
   private String licensePlate;
   
   public Auto(String vin, String plate)
   {
      super(vin);
      licensePlate = plate;
   }
   
   public String getID()
   {
      return "VIN=" + super.getID() + "," + "plate=" + licensePlate;
   }


}