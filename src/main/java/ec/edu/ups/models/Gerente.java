package ec.edu.ups.models;

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
    public String toString() {
        return "Gerente{" +
                "contrasena='" + contrasena + '\'' +
                '}';
    }
}
