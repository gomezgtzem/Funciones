package com.generation;

public class Main {

    public static void main(String[] args) {
        // Metodos en Java
        /*
        String mensaje = saludar("Emmanuel");
        System.out.println(mensaje);
        int resultado = suma(5, 3);
        System.out.println(resultado);
        alerta("Mensaje de prueba");
//        Libreria MATH
        System.out.println(Math.PI);
        double num1 = 13.75d;
        double num2 = 23.12d;
        double num3 = 9d;
//        Redondear hacia arriba
        System.out.println(Math.ceil(num2));
        System.out.println(Math.floor(num1));
        System.out.println(Math.sqrt(num3));*/
        String mensaje1 = "HOOOOOOOOOOLA - mensaje 1";
        String mensaje2 = "HOLA - mensaje 2";

        System.out.println(mensaje1.length());
        System.out.println(mensaje1.isEmpty());
        System.out.println(mensaje1.concat(mensaje2));
        System.out.println(mensaje1.equalsIgnoreCase(mensaje2));
        System.out.println(mensaje1.compareTo(mensaje2));

    }

    public static String saludar(String nombre) {
        return "Hola, como estas " + nombre;
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void alerta(String mensaje) {
        System.out.println(mensaje);
    }
}
