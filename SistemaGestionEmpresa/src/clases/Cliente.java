package clases;

import interfaces.PagoCliente;

public class Cliente extends Persona implements PagoCliente {
    private Empresa empresa;
    private Empleado empleadoAtencion;

//contructor
    public Cliente(String id, String cedula, String nombre, String apellido, String balance, int edad, String estadoCivil, Empresa empresa, Empleado empleadoAtencion) {
        super(id, cedula, nombre, apellido, balance, edad, estadoCivil);
        this.empresa = empresa;
        this.empleadoAtencion = empleadoAtencion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empleado getEmpleadoAtencion() {
        return empleadoAtencion;
    }

    public void setEmpleadoAtencion(Empleado empleadoAtencion) {
        this.empleadoAtencion = empleadoAtencion;
    }

    @Override
    public String toString() {
        return "Cliente: \n" +
                super.toString() + "\n" +
                "empresa = " + empresa.getNombre() + "\n" +
                "empleadoAtencion = " + empleadoAtencion.getNombre();
    }

    @Override
    public void pagar() {

    }
}
