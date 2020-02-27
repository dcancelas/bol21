package bol21;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String nomeFicheiro = "libros.txt";
        Libreria libreria = new Libreria();

        int opcion = PedirDatos.pedirInt("Selecciona unha opción: ");
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Opción 1");
                    break;
                case 2:
                    System.out.println("Opción 2");
                    break;
                case 3:
                    System.out.println("Opción 3");
                    break;
                case 4:
                    System.out.println("Opción 4");
                    break;
                case 5:
                    System.out.println("Opción 5");
                    break;
            }
        }while (opcion != 6);
    }
}
