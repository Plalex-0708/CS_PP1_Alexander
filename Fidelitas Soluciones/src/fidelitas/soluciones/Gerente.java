package fidelitas.soluciones;

public class Gerente extends Empleado {

    private int numeroDeProyectos;
    private boolean mba;
    private String departamento;

    public Gerente() {
    }

    public Gerente(String nombre, String cedula, int edad, boolean casado, double salario,
            int numeroDeProyectos, boolean mba, String departamento) {
        super(nombre, cedula, edad, casado, salario);
        this.numeroDeProyectos = numeroDeProyectos;
        this.mba = mba;
        this.departamento = departamento;
    }

    public int getNumeroDeProyectos() {
        return numeroDeProyectos;
    }

    public void setNumeroDeProyectos(int numeroDeProyectos) {
        this.numeroDeProyectos = numeroDeProyectos;
    }

    public boolean isMba() {
        return mba;
    }

    public void setMba(boolean mba) {
        this.mba = mba;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Número de Proyectos: " + numeroDeProyectos
                + "\nMBA: " + mba
                + "\nDepartamento: " + departamento);
    }
}
