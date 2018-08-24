public class Variables {
    public static void main(String args[]){
        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 26;
        double height = 1.90;
        final String pesel = "90031315095";

        String carName = "Volvo";
        String carModel = "XC60";
        int productionYear = 2012;
        double kilometrage = 102000.1;
        double price = 46.40;

        System.out.print("Cześć, nazywam się ");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.print(lastName);

        System.out.print("Wiek");
        System.out.print(age);

        System.out.print("Wzrost");
        System.out.print(height);

        System.out.print("PESEL");
        System.out.print(pesel);

        System.out.print("Car model: ");
        System.out.print(carName + (" ") + carModel);
        System.out.print("Przebieg: ");
        System.out.print(kilometrage);
        System.out.print("Price: ");
        System.out.print(price + "k");

    }
}