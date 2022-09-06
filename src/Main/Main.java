/** @author Mohyla Sofia */
package Main;

/** import of packages */
import Car.Car;
import java.util.Scanner;


/** Main class */
public class Main {
    public static void main(String[] args) {
        Car[] cars = generateNewArray();
        ModelCheck(cars);
        ExpluatationYearCheck(cars);
        priceCheck(cars);
    }

    /** method for generating an array of objects of class Car */
    static Car[] generateNewArray() {
        return new Car[] {
                new Car(1, "Ford", 2004, 2000, 1221973),
                new Car(2, "Asia", 2008, 5000, 1420073),
                new Car(3, "Audi", 2010, 5400, 1120073),
                new Car(4, "Ford", 2020, 14000, 2220073),
                new Car(5, "Dadi", 2003, 5000, 1499073),
                new Car(6, "SEAT", 2015, 12100,  1433373),
                new Car(7, "Ford", 2010, 6700, 1910073),
                new Car(8, "Jeep", 2021, 31000,  1422373),
                new Car(9, "Mega", 2018, 8300, 1020073),
        };
    }

    /** a method for finding a list of cars with the specified model */
    static void ModelCheck(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model to find: ");
        String model = scanner.nextLine();
        int k = 0;
        for(int i = 0; i < cars.length; i++){
            if(model.equals(cars[i].getModel())) {
                System.out.println(cars[i].toString());
                k++;
            }
        }
        if(k == 0) {
            System.out.println("There aren't the same model!");
        }
    }

    /** a method for finding a list of cars whose expluatation is more than  in a given year */
    static void ExpluatationYearCheck(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many years: ");
        int year = scanner.nextInt();
        int k = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i].getYear()+year <= 2022 ) {
                System.out.println(cars[i].toString());
                k++;
            }
        }
        if (k == 0) {
            System.out.printf("There aren't such cars!\n");
        }
    }

    /** method for finding the  list of cars, the price  of which is bigger than input price */
    static void priceCheck(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int yearCheck = scanner.nextInt();
        System.out.println("Enter price: ");
        int priceChack = scanner.nextInt();

        for(int i = 0; i < cars.length; i++) {
            if(yearCheck == cars[i].getYear() && cars[i].getPrice()>= priceChack) {
                System.out.println(cars[i].toString());
            }
        }
    }
}

