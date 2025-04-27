package ec.edu.ups.models;

public class Proveedor extends Persona {
    private String detalleProvedor;
    private Direccion direccion;
    private String telefono;

    public Proveedor() {}

    public Proveedor(String identificacion, String nombre, String apellido, String detalleProvedor, Direccion direccion, String telefono) {
        super(identificacion, nombre, apellido);
        this.detalleProvedor = detalleProvedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDetalleProvedor() {
        return detalleProvedor;
    }

    public void setDetalleProvedor(String detalleProvedor) {
        this.detalleProvedor = detalleProvedor;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\tProveedor{" +
                super.toString() +
                "detalleProvedor='" + detalleProvedor + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}