package com.mycompany.tv.midia;

public class Serie extends Multimidia {
    private int temporadas;
    private int capitulos_temporada;

    public Serie(String titulo, String sinopse, String genero,
            int temporadas, int capitulos) {
        super(titulo, sinopse, genero);
        this.temporadas = temporadas;
        this.capitulos_temporada = capitulos;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getCapitulos_temporada() {
        return capitulos_temporada;
    }

    public void setCapitulos_temporada(int capitulos_temporada) {
        this.capitulos_temporada = capitulos_temporada;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nTemporadas: " + temporadas +
                ", Capítulos: " + capitulos_temporada;
    }
    
    
}
