package bol21;

public class Libro {

    private String nome;
    private String autor;
    private double prezo;
    private int unidades;

    public Libro() {
    }
    public Libro(String nome, String autor, double prezo, int unidades) {
        this.nome = nome;
        this.autor = autor;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPrezo() {
        return prezo;
    }
    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }
    public int getUnidades() {
        return unidades;
    }
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", prezo=" + prezo +
                ", unidades=" + unidades +
                '}';
    }
}
