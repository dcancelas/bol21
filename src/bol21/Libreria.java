package bol21;

import java.io.File;
import java.util.ArrayList;

public class Libreria {

    public void engadirLibro(String nomeFicheiro) {
        String nome = PedirDatos.pedirString("Introduce o nome: ");
        String autor = PedirDatos.pedirString("Introduce o autor: ");
        double prezo = PedirDatos.pedirDouble("Introduce o prezo: ");
        int unidades = PedirDatos.pedirInt("Introduce o número de unidades: ");
        Libro libro = new Libro(nome, autor, prezo, unidades);

        EditFicheiro editFicheiro = new EditFicheiro();
        editFicheiro.escritura(nomeFicheiro, libro);
    }

    public void consultarLibro(String nomeFicheiro) {
        File ficheiro = new File(nomeFicheiro);
        String nome = PedirDatos.pedirString("Introduce o nome: ");
        double prezo = 0;
        EditFicheiro editFicheiro = new EditFicheiro();
        ArrayList<Libro> libreria = editFicheiro.lectura(ficheiro);
        int i = 0;
        for (int j = 0; j < libreria.size(); j++) {
            if (nome.equals(libreria.get(j).getNome())) {
                prezo = libreria.get(j).getPrezo();
                i = 1;
            }
        }
        if (i == 1) System.out.println("Prezo: "+prezo);
        else System.out.println("O libro non se atopa na librería");
    }

    public void visualizarLibros(String nomeFicheiro) {
        File ficheiro = new File(nomeFicheiro);
        EditFicheiro editFicheiro = new EditFicheiro();
        ArrayList<Libro> libreria = editFicheiro.lectura(ficheiro);
        for (int i = 0; i < libreria.size(); i++) {
            System.out.println(libreria.get(i));
        }
    }

    public void borrarLibros(String nomeFicheiro) {
        File ficheiro = new File(nomeFicheiro);
        EditFicheiro editFicheiro = new EditFicheiro();
        ArrayList<Libro> libreria = editFicheiro.lectura(ficheiro);
        int i = 0;
        for (int j = 0; j < libreria.size(); j++) {
            if (libreria.get(j).getUnidades() == 0) {
                libreria.remove(j);
                i = 1;
            }
        }
        if (i == 1) {
            ficheiro.delete();
            for (int j = 0; j < libreria.size(); j++) {
                Libro libro = new Libro(
                        libreria.get(j).getNome(),
                        libreria.get(j).getAutor(),
                        libreria.get(j).getPrezo(),
                        libreria.get(j).getUnidades()
                );
                editFicheiro.escritura(nomeFicheiro, libro);
            }
            System.out.println("Os libros sen stock foron eliminados");
        }
        else System.out.println("Non hai libros sen stock");
    }

    public void modPrezo(String nomeFicheiro) {
        File ficheiro = new File(nomeFicheiro);
        String nome = PedirDatos.pedirString("Introduce o nome: ");
        int posicion = 0;
        EditFicheiro editFicheiro = new EditFicheiro();
        ArrayList<Libro> libreria = editFicheiro.lectura(ficheiro);
        int i = 0;
        for (int j = 0; j < libreria.size(); j++) {
            if (nome.equals(libreria.get(j).getNome())) {
                posicion = j;
                i = 1;
            }
        }
        if (i == 1) {
            libreria.get(posicion).setPrezo(PedirDatos.pedirDouble("Introduce o novo prezo: "));
            ficheiro.delete();
            for (int j = 0; j < libreria.size(); j++) {
                Libro libro = new Libro(
                        libreria.get(j).getNome(),
                        libreria.get(j).getAutor(),
                        libreria.get(j).getPrezo(),
                        libreria.get(j).getUnidades()
                );
                editFicheiro.escritura(nomeFicheiro, libro);
            }
        }
        else System.out.println("O libro non se atopa na librería");
    }
}
