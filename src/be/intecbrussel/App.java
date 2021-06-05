package be.intecbrussel;

public class App {

    public static void main(String[] args) {

        Car mazda = new Car("Mazda", "RX7", "Yellow");

        mazda.accelerate();
        mazda.slowDown();
        mazda.turnLeft();
        mazda.slowDown();

        System.out.println(mazda + " is reaching her destination.");
        
       
        System.out.println();
        // *****************************************************

        SUV jeep = new SUV("Toyota", "Land Cruiser", "Green");

        jeep.accelerate();
        jeep.slowDown();

        jeep.turnRight();

        jeep.slowDown();

        System.out.println(jeep + " is reaching her destination.");

        
        System.out.println();
        // ******************************************************

        ElectricCar tesla = new ElectricCar("Tesla", "X", "White", 99.9F);

        tesla.accelerate();
        tesla.slowDown();

        tesla.turnLeft();

        tesla.slowDown();
        tesla.chargeBattery(50);

        System.out.println(tesla);
        
        
        System.out.println();
        // ************************************************************

        SportsCar rx8 = new SportsCar("Mazda", "RX8", "White", -200);

        rx8.setHp(-200);

        System.out.println(rx8);

        
        System.out.println();
        // ***************************************************************

        Convertible mx5 = new Convertible("Mazda", "MX5", "Red");
        mx5.switchRoof();

    }

}
