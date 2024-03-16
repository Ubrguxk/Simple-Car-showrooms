import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Prototype Vehicles:

        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", ItemCondition.NEW, 30000.0, 2023, 0.0, 2.5);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", ItemCondition.USED, 20000.0, 2018, 50000.0, 1.8);
        Vehicle vehicle3 = new Vehicle("Ford", "F-150", ItemCondition.DAMAGED, 35000.0, 2019, 20000.0, 3.5);
        Vehicle vehicle1Copy = new Vehicle("Toyota", "Camry", ItemCondition.NEW, 30000.0, 2023, 0.0, 2.5);

        // -------------------------------------------------------------------

        System.out.println("Simple Car showrooms software");

        // CarShowroom centre usage
        /*
        CarShowroomContainer salon2 = new CarShowroomContainer();
        salon2.addCenter("carShowA",1);
        salon2.addCenter("carShowB",2);
        salon2.addCenter("carShowC",3);
        salon2.addCenter("carShowD",3);
        CarShowroom carShowA = salon2.salons.get("carShowA");
        CarShowroom carShowB = salon2.salons.get("carShowB");
        carShowA.addProducts(vehicle1);
        carShowB.addProducts(vehicle1);

        // Show all empty showrooms in the centre
        salon2.findEmpty();

        // All showrooms in the centre
        salon2.summanary();
        */
        // -------------------------------------------------------------------
        // Showroom usage

        // Temporary CarShowroom Container
        CarShowroomContainer salon1 = new CarShowroomContainer();
        salon1.addCenter("carShow1",10);
        CarShowroom carShow1 = salon1.salons.get("carShow1");

        // Add products to the newly added showroom
        carShow1.addProducts(vehicle1);
        carShow1.addProducts(vehicle2);
        carShow1.addProducts(vehicle3);
        carShow1.addProducts(vehicle1Copy);
        carShow1.addProducts(vehicle1Copy);
        carShow1.addProducts(vehicle2);

        // Show all added Product
        //carShow1.summanary();

        //getProduct - get product from the showroom - if there are multiple of the same car - delete one of them

        /*
        carShow1.getProduct(vehicle1);
        carShow1.getProduct(vehicle1);
        carShow1.summanary();
        */

        //removeProduct - delete product from showroom - even if there are multiple of them
        /*
        carShow1.removeProduct(vehicle1);
        carShow1.summanary();
        */

        //search -  search car by full given name

        //Vehicle foundCar = carShow1.search("Camry");
        //Vehicle foundCar1 = carShow1.search("Miata");

        //searchPartial - search product with given few characters

        //carShow1.searchPartial("C");

        //countByCondition - summarize how many cars are with each conditions
        //carShow1.countByCondition();;

        //SortByName - sort car alphabetically by label

        //carShow1.sortByName();
        //carShow1.summanary();

        //SortByAmount - sort by amount of each car (3->2->1)

        //carShow1.sortByAmount();
        //carShow1.summanary();

        // max - show the car with the most amount
        //Vehicle maxim = carShow1.max();

    }
}