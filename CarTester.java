import java.util.Scanner;

public class CarTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car firstCar = addCar();
        System.out.println(firstCar);
        System.out.println("--------------NEXT CAR--------------");
        Car secondCar = addCar();
        System.out.println(secondCar);
    }
    
    public static Car addCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the car's name: ");
        String carname = scanner.nextLine();
        System.out.println("Please enter car's miles: ");
        double miles = scanner.nextDouble();
        System.out.println("Please enter car's gallons: ");
        double gallons = scanner.nextDouble();
        Car userCar = new Car(carname, miles, gallons);
        return userCar;
    }
}
