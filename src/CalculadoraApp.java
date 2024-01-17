import java.util.Scanner;

public class CalculadoraApp {
    
    public static void main(String[] args) {
        System.out.println("***** Calculator App *****");
        System.out.print("First value: ");
        Scanner consola = new Scanner(System.in);
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.println("Second value: ");
        var operando2 = Integer.parseInt(consola.nextLine());
        var resultado = operando1 + operando2;

        System.out.println("Result: " + resultado);

        consola.close();
    }
}
