package fidelitas.soluciones;

public class Disenador extends Empleado {

    private String herramientaPrincipal;
    private int proyectosCompletados;
    private boolean expertoEnUI;

    public Disenador(String herramientaPrincipal, int proyectosCompletados, boolean expertoEnUI) {
        this.herramientaPrincipal = herramientaPrincipal;
        this.proyectosCompletados = proyectosCompletados;
        this.expertoEnUI = expertoEnUI;
    }

    public Disenador(String nombre, String cedula, int edad, boolean casado, double salario,
            String herramientaPrincipal, int proyectosCompletados, boolean expertoEnUI) {
        super(nombre, cedula, edad, casado, salario);
        this.herramientaPrincipal = herramientaPrincipal;
        this.proyectosCompletados = proyectosCompletados;
        this.expertoEnUI = expertoEnUI;

    }

    public String getHerramientaPrincipal() {
        return herramientaPrincipal;

    }

    public void setHerramientaPrincipal(String herramientaPrincipal) {
        this.herramientaPrincipal = herramientaPrincipal;

    }

    public int getProyectosCompletados() {
        return proyectosCompletados;

    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;

    }

    public boolean isExpertoEnUI() {
        return expertoEnUI;

    }

    public void setExpertoEnUI(boolean expertoEnUI) {
        this.expertoEnUI = expertoEnUI;

    }

    @Override

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Herramienta Principal: " + herramientaPrincipal
                + "\nProyectos Completados: " + proyectosCompletados
                + "\nExperto en UI: " + expertoEnUI
        );
    }
}
