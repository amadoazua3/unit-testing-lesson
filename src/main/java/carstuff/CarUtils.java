package carstuff;

public class CarUtils {

    public static String getCarDetails(Car car){


        String make = car.getMake();
        String model = car.getModel();
        String year = car.getYear();
        String color = car.getColor();

        if(car.getMake() == null || car.getModel() == null || car.getYear() == null || car.getColor() == null){
            return "Not able to provide details";
        }

        return car.getColor() + " " +car.getMake() + " " + car.getModel() + " " + car.getYear();

    }

    // TODO In CarUtils, write a static void method called addToMileage. This method takes in a car object and a double 'mileageToAdd'. The method will set the car's mileage to be equal to the current mileage + the mileageToAdd
    // TODO Then, write a test, following Arrange/Act/Assert which tests whether the new mileage was correctly added. You will probably call car.getMileage in your assertion and compare it to what you expect.


    public static void addToMileage(Car car, double mileageToAdd){

        car.setMileage(car.getMileage() + mileageToAdd);

    }

}
