package bol21;

import java.util.Scanner;

public class PedirDatos {
    public PedirDatos() {
    }

    public static int pedirInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int a = sc.nextInt();
        return a;
    }

    public static int pedirInt(String mensaxe) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaxe);
        int a = sc.nextInt();
        return a;
    }

    public static float pedirFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        float b = sc.nextFloat();
        return b;
    }

    public static double pedirDouble(String mensaxe) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaxe);
        double a = sc.nextDouble();
        return a;
    }

    public static double pedirDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        double b = sc.nextDouble();
        return b;
    }

    public static float pedirFloat(String mensaxe) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaxe);
        float b = sc.nextFloat();
        return b;
    }

    public static String pedirString(String mensaxe) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaxe);
        String c = sc.next();
        return c;
    }
}