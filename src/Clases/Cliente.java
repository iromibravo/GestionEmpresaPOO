package Clases;

public class Cliente extends Persona {
    private Empresa empresa;
    private Empleado empleado;

//contructor
    public Cliente(String id, int cedula, String nombre, String apellido, String balance, int edad, String estadoCivil, Empresa empresa, Empleado empleado) {
        super(id, cedula, nombre, apellido, balance, edad, estadoCivil);
        this.empresa = empresa;
        this.empleado = empleado;
    }
}
