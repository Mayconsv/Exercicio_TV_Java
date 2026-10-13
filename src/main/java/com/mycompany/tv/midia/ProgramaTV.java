package com.mycompany.tv.midia;

public class ProgramaTV extends Multimidia {
    private String Apresentador;
    private int horario;
    private String Canal;

    public ProgramaTV(String Canal, String Apresentador, int horario, String titulo, String sinopse, String genero) {
        super(titulo, sinopse, genero);
        this.Apresentador = Apresentador;
        this.horario = horario;
        this.Canal = Canal;
    }

    public String getApresentador() {
        return Apresentador;
    }

    public void setApresentador(String Apresentador) {
        this.Apresentador = Apresentador;
    }

    public int getHorario() {
        return horario;
    }
    
    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getCanal() {
        return Canal;
    }

    public void setCanal(String Canal) {
        this.Canal = Canal;
    }
       
    @Override
    public String toString() {
        return super.toString() + "\nCanal: " + Canal + "\nApresentador: " + Apresentador +
                "\nHorário: " + horario;
    }
}
