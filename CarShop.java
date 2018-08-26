public class CarShop {
    public static void main(String args[]) {
        Car audi = new Car();
        Car bmw = new Car();
        // Car audiCopy = audi;
        Car audi1 = new Car();

        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelsColor = "Srebrny";
        audi.tiresColor = "Czarny";

        String audiInfo = audi.brand + " " + audi.model
                            + " Drzwi: " + audi.doors
                            + " Kolor nadwozia " + audi.carColor
                            + " Kolor felg " + audi.wheelsColor
                            + " Kolor opon " + audi.tiresColor;

        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(audiInfo);

        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(audiInfo);

        bmw.brand = "Bmw";
        bmw.model = "X5";
        String bmwInfo = bmw.brand + " " + bmw.model;

        System.out.println(bmwInfo);

        // audiCopy.model = "A5";
        // System.out.println(audi.model);

        audi1.brand = "Audi";
        audi1.model = "A5";

        System.out.println(audi1.model + " " + audi1.brand);
    }
}