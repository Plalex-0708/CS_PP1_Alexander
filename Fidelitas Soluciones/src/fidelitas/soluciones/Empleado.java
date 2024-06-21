package fidelitas.soluciones;

public class Empleado {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.setEdad(edad);
        this.casado = casado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 18 || edad > 45) {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años.");
        }
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String clasificacionPorEdad() {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + "\nCedula: " + cedula + "\nEdad: " + edad
                + "\nCasado: " + casado + "\nSalario: " + salario);
    }

    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

}
