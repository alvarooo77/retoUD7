package vehiculo;
public class Particular extends Turismo implements Iniciable {
    private String propietarios;
    private boolean conAireAcondicionado;
    public Particular(String marca, String modelo, String bastidor, int puertas, Asientos tipoAsiento,
            String propietarios, boolean conAireAcondicionado) {
        super(marca, modelo, bastidor, puertas, tipoAsiento);
        this.propietarios = propietarios;
        this.conAireAcondicionado = conAireAcondicionado;
    }
    public String getPropietarios() {
        return propietarios;
    }
    public void setPropietarios(String propietarios) {
        this.propietarios = propietarios;
    }
    public boolean isConAireAcondicionado() {
        return conAireAcondicionado;
    }
    public void setConAireAcondicionado(boolean conAireAcondicionado) {
        this.conAireAcondicionado = conAireAcondicionado;
    }

    
}
