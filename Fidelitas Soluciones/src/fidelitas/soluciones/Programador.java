package fidelitas.soluciones;

public class Programador extends Empleado {

    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
    }

    public Programador(String nombre, String cedula, int edad, boolean casado, double salario,
            int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Lineas de Código por Hora: " + lineasDeCodigoPorHora
                + "\nLenguaje Dominante: " + lenguajeDominante);
    }
}
