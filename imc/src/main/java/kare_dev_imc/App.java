package kare_dev_imc;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();
        
        double imc = calcularIMC(peso, estatura);
        String categoria = categorizarIMC(imc);
        
        System.out.printf("Su IMC es: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);
        
        scanner.close();
    }
    
    public static double calcularIMC(double peso, double estatura) {
        return peso / (estatura * estatura);
    }
    
    public static String categorizarIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
