public class Company {
    public static void main(String args[]) {
        Employee anna = new Employee();
        anna.firstName = "Anna";
        anna.secondName = "Kowalska";
        anna.workingYears = 5;
        anna.dateBrith = "01.01.1895";

        Employee kazik = new Employee();
        kazik.firstName = "Kazimierz";
        kazik.secondName = "Niekowalski";
        kazik.workingYears = 1;
        kazik.dateBrith = "05.09.1915";

        String annaInfo = anna.firstName + anna.secondName + " working " + anna.workingYears + "lat";
        System.out.println(annaInfo);
    }
}