import carstuff.Car;
import carstuff.CarUtils;
import org.junit.Assert;
import org.junit.Test;

public class CarDetailsTests {

    @Test
    public void getCarDetails_GivenValidCar_ReturnsExpectedString() {

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");
        car.setColor("White");


        //Act
        String details = CarUtils.getCarDetails(car);


        //Assert
        Assert.assertEquals("White Ford Mustang 2019", details);

    }

    @Test
    public void getCarDetails_GivenNullValues_ReturnsErrorString(){

        //Arrange
        Car car = new Car();


        //Act
        String details = CarUtils.getCarDetails(car);


        //Assert
        Assert.assertEquals("Not able to provide details", details);

    }

    @Test
    public void getCarDetails_GivenOneNullValues_ReturnsErrorString(){

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        //we did not set the year

        //Act
        String details = CarUtils.getCarDetails(car);


        //Assert
        Assert.assertEquals("Not able to provide details", details);

        }

    @Test
    public void getCarDetails_GivenTwoNullValues_ReturnsErrorString(){

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        //we did not set the model
        //we did not set the year

        //Act
        String details = CarUtils.getCarDetails(car);


        //Assert
        Assert.assertEquals("Not able to provide details", details);

    }

    // TODO Update the CarUtils.getCarDetails method to now include the color of the car in its returned string. Then run your tests again and update the tests as needed


    // new Test

    @Test
    public void addToMileage_ReturnsCorrectMileage(){

        //Arrange
        Car car = new Car();
        car.setMileage(10000.0);

        //Act
        CarUtils.addToMileage(car,40000.0);


        //Assert
        Assert.assertEquals(50000.0, car.getMileage(), 0);

    }

    // TODO Then, write a test following Arrange/Act/Assert which tests convertToElectric on whether the car's isElectric field was set when 'electric' is present in the engineType string.

    // TODO Then, write a test to make sure that convertToElectric will set the car's isElectric field regardless of how the string with 'electric' is capitalized.

    // TODO For BOTH of these tests, you will use assertTrue or assertFalse to see if car.isElectric is true or false. Be sure to look at the curriculum on how to use those methods!

    @Test
    public void convertToElectric_ReturnsTrue(){

        //Arrange
        Car car = new Car();

        //Act
        CarUtils.convertToElectric(car, "electric");

        //Assert
        Assert.assertTrue(car.isElectric());

    }

    @Test
    public void convertToElectric_ReturnsFalse(){

        //Arrange
        Car car = new Car();

        //Act
        CarUtils.convertToElectric(car, "V-8 Turbo Diesel");

        //Assert
        Assert.assertFalse(car.isElectric());

    }

    @Test
    public void convertToElectric_GivenUpperCase_ReturnsTrue(){

        //Arrange
        Car car = new Car();

        //Act
        CarUtils.convertToElectric(car, "Electric");

        //Assert
        Assert.assertTrue(car.isElectric());

    }

}
