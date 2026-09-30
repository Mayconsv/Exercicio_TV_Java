
package com.mycompany.tv.midia;

public class Multimidia {
    protected String titulo;
    protected String sinopse;
    protected String genero;

    
    public Multimidia(String genero,String titulo){
        this.titulo=titulo;
        this.genero = genero;
        this.sinopse = "Lorem Ipsum";
    }
    
        public Multimidia(String titulo, String sinopse, String genero){
        this.titulo=titulo;
        this.sinopse = sinopse;
        this.genero = genero;
    }
        
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public String toString(){
    return "Titulo :" + this.titulo +
            "\ngenero: " + this.genero + 
            "\nsinopse: " + this.sinopse;
    }
}
