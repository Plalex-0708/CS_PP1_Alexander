package fidelitas.soluciones;

public class Analista extends Empleado {

    private int añosExperiencia;
    private String areaEspecializacion;
    private boolean certificadoPMP;

    public Analista(int añosExperiencia, String areaEspecializacion, boolean certificadoPMP) {
        this.añosExperiencia = añosExperiencia;
        this.areaEspecializacion = areaEspecializacion;
        this.certificadoPMP = certificadoPMP;
    }

    

    public Analista(String nombre, String cedula, int edad, boolean casado, double salario,
            int añosExperiencia, String areaEspecializacion, boolean certificadoPMP) {
        super(nombre, cedula, edad, casado, salario);
        this.añosExperiencia = añosExperiencia;
        this.areaEspecializacion = areaEspecializacion;
        this.certificadoPMP = certificadoPMP;
    }

    Analista(String carlos_Ruiz, String string, int i, boolean b, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public boolean isCertificadoPMP() {
        return certificadoPMP;
    }

    public void setCertificadoPMP(boolean certificadoPMP) {
        this.certificadoPMP = certificadoPMP;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Años de Experiencia: " + añosExperiencia
                + "\nÁrea de Especialización: " + areaEspecializacion
                + "\nCertificado PMP: " + certificadoPMP);
    }
}
