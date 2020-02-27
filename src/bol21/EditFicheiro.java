package bol21;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EditFicheiro {

    PrintWriter escribir = null;
    FileWriter ficheiro;
    Scanner sc;

    public void escritura(String nomeFicheiro, Libro libro) {
        try {
            ficheiro = new FileWriter(nomeFicheiro, true);
            escribir = new PrintWriter(ficheiro);
            escribir.println(libro.getNome()+", "+libro.getAutor()+", "+libro.getPrezo()+", "+libro.getUnidades());
        } catch (IOException e) {
            System.out.println("Erro "+e.toString());
        } finally {
            escribir.close();
        }
    }

    public ArrayList<Libro> lectura(File ficheiro) {
        String cadea;
        ArrayList<Libro> libreria = new ArrayList<>();

        try {
            sc = new Scanner(ficheiro);
            while (sc.hasNextLine()) {
                cadea = sc.nextLine();
                String[] datos = cadea.split(", ");
                libreria.add(new Libro(datos[0], datos[1], Double.parseDouble(datos[2]), Integer.parseInt(datos[3])));
            }
        }catch (FileNotFoundException ex) {
            System.out.println("Erro lectura obxetos "+ex.toString());
        }finally {
            sc.close();
        }
        return libreria;
    }
}
