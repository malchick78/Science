public class VehicleTest
{
  public static int MAX = 4;
  public static void main(String[] args)
  {

    //make instances of different vehicles
    Vehicle carVehicle = new Vehicle("car", "Ford", "red");
    Vehicle truckVehicle = new Vehicle("truck", "Nissan", "green");
    Vehicle busVehicle = new Vehicle("bus", "Mercedes", "white");
    Vehicle motorBikeVehicle = new Vehicle("motorbike", "Honda", "silver");

    System.out.println("");

    //create an array of these Vehicles
    Vehicle[] ve = new Vehicle[MAX];
    ve[0] = carVehicle;
    ve[1] = truckVehicle;
    ve[2] = busVehicle;
    ve[3] = motorBikeVehicle;

    System.out.println("\nOutput of array before being sorted");

    for(int i = 0; i < MAX; i++)
      System.out.println(ve[i]);

    // Sort the array by vehicle make.
    VehicleObjectInsertionSorter.insertionSort(ve, "make");

    System.out.println("\nOutput of array after being sorted by vehicle make");
    for(int i = 0; i < MAX; i++)
      System.out.println(ve[i]);
    
    // Sort the array by vehicle type.
    VehicleObjectInsertionSorter.insertionSort(ve,"type");

    System.out.println("\nOutput of array after being sorted by vehicle type");
    for(int i = 0; i < MAX; i++)
      System.out.println(ve[i]);
	
    // Sort the array by vehicle colour.
    VehicleObjectInsertionSorter.insertionSort(ve,"colour");

    System.out.println("\nOutput of array after being sorted by vehicle colour");
    for(int i = 0; i < MAX; i++)
      System.out.println(ve[i]);
    
  }
}

