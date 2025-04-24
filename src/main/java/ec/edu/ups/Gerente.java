package ec.edu.ups;

import java.util.Objects;

public class Gerente extends Empleado {
    private String contrasena;

    public Gerente() {

    }

    public Gerente(String identificacion, String nombre, String apellido, Departamento departameto, String contrasena) {
        super(identificacion, nombre, apellido, departameto);
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public boolean aprobar (String intentoContrasena){
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gerente gerente = (Gerente) o;
        return Objects.equals(contrasena, gerente.contrasena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contrasena);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "contrasena='" + contrasena + '\'' +
                '}';
    }
}
