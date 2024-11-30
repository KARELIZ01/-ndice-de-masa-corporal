package lesson1.java;

public class Lesson1{
    public static void main(String[] args) {
    
    int edad = 25;
    System.out.println("Edad: " + edad);
    
    double altura = 1.65;
    System.out.println("Altura: " + altura);

    String nombre = "Kareliz";
    System.out.println("Nombre: " + nombre);

    boolean esEstudiante = true;
    System.out.println("Es estudiante: " + esEstudiante);

    System.out.println("Suma de 5 y 3: " + suma(5, 3));
    
}

    public static String obtenerNOmbre() {
    return "Kareliz";
}
    public static boolean esEstudiante(){
        return true;
    }
    public static double obtenerAltura(){
        return 1.65;
    }
public static int obtenerEdad() {
return 25;
}
public static int suma(int a, int b) {
    return a + b;
}
}



