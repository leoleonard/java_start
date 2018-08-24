public class Conversions {
    public static void main(String args[]) {
        double number1 = 10.978;
        int number2 = 5;

        int narrowing = (int)number1;

        double widening = (double)number2;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println("Narrowing: " + narrowing);
        System.out.println("Widening: " + widening);


        char letter1 = 'k';
        char letter2 = 'o';
        char letter3 = 't';

        System.out.println("Błędne \"sumowanie\" znaków");
		System.out.println(letter1 + letter2 + letter3);
		System.out.println("Tekst jawny");
		System.out.println("" + letter1 + letter2 + letter3);
		letter1++;
		letter2++;
		letter3++;
		System.out.println("Tekst zaszyfrowany");
		System.out.println("" + letter1 + letter2 + letter3);
    }
}