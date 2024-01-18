import java.util.Scanner;

public class CalculadoraApp {
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean app_on = true;
        while (app_on) {
            showMenu();
            try{
                var operacion = Integer.parseInt(consola.nextLine());
                if(operacion >= 1 && operacion <= 4){
                    System.out.println("Resultado: " + ejecuteOption(operacion, consola));
                }else if(operacion == 5){
                    System.err.println("Goodbye!");
                    app_on = false;
                }else{
                    System.out.println("Opcion Erronea");
                }
            }catch(Exception e){
                System.out.println("Ocurrio un error!" + e.getMessage());
            }
            
            System.out.println();
        }
        consola.close();
    }

    private static void showMenu() {
        System.out.println("***** Calculator App *****");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicar
                4. Dividir
                5. Salir
                """);
        System.out.print("Operacion a realizar? ");
    }

    private static double ejecuteOption(int operacion, Scanner consola){
        System.out.print("First value: ");
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Second value: ");
        var operando2 = Integer.parseInt(consola.nextLine());
        var resultado = 0;
        switch (operacion) {
            case 1: //suma
                resultado = operando1 + operando2;
                break;
            case 2:
                resultado = operando1 - operando2;
                break;
            case 3:
                resultado = operando1 * operando2;
                break;                    
            case 4:
                resultado = operando1 / operando2;
                break;
            default:
                System.out.println("Unknow Option");
                break;
        }
        return resultado;
    }
    
}
