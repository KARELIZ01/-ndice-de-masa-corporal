package kata_dni;

import java.util.Scanner;

public class App {

    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDNI = pedirNumero (scanner);
        char letraDNI = calcularLetra(numeroDNI);
        System.out.println(" La letra del DNI " + numeroDNI + "es: " + letraDNI);
        scanner.close();
            }

            public static int pedirNumero(Scanner scanner){
                int numero;
                do {
                    System.out.print("Introduce el número del DNI (entre 0 y 99999999): ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("El dato introducido es incorrecto. Debe ser un número.");
                        scanner.next();
                    }
                    numero = scanner.nextInt();
                } while (numero < 0 || numero > 99999999);
                return numero;
            }
        
            public static char calcularLetra(int numero) {
                return LETRAS.charAt(numero % 23);
                }
            }



            

        