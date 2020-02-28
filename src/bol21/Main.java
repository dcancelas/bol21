package bol21;

import javax.swing.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        String nomeFicheiro = "libros.txt";
        Libreria libreria = new Libreria();

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "-- LIBRERIA --"+
                    "\n1. Engadir libro"+
                    "\n2. Consultar libro"+
                    "\n3. Visualizar libros"+
                    "\n4. Borrar libros sen stock"+
                    "\n5. Modificar precio"+
                    "\n6. Saír"+
                    "\n\nSelecciona unha opción:"));
            switch (opcion) {
                case 1:
                    libreria.engadirLibro(nomeFicheiro);
                    break;
                case 2:
                    libreria.consultarLibro(nomeFicheiro);
                    break;
                case 3:
                    libreria.visualizarLibros(nomeFicheiro);
                    break;
                case 4:
                    libreria.borrarLibros(nomeFicheiro);
                    break;
                case 5:
                    libreria.modPrezo(nomeFicheiro);
                    break;
            }
        }while (opcion != 6);
    }
}
