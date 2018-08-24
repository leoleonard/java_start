public class Operatory {
    public static void main(String args []) {
        int x = 5;
        int y = 10;
        int sum = x + y;
        int sub = x - y;
        int multi = x * y;
        double div = x/y;
        int mod = x % y;
        boolean logic = true;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);

        System.out.print("Czy X jest większy od Y? ");
		System.out.println(x > y);
		
		System.out.print("Czy X jest różny od Y? ");
		System.out.println(x != y);
		
		boolean instance = "Kasia" instanceof java.lang.String;
        System.out.println(instance); 
        
        System.out.println("x<10 && y<11? ");
        System.out.println(x<10 && y<11);

        System.out.print("x<10 || y<10? ");
		System.out.println(x<10 || y<10);
		
		System.out.print(logic);
		System.out.print(" , !logic = ");
		System.out.println(!logic);
		
		System.out.print("Warunek złożony !(x<10 && y<10) ");
		System.out.println(!(x<10 && y<10));

    }
}