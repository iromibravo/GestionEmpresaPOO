package Clases;

public class Empleado extends Persona{

    private double sueldo;
    private String cargo;
    private Direccion direccion;
    private Departamento departamento;

    //constructor que recibe por argumento los datos

    public Empleado(String id, int cedula, String nombre, String apellido, String balance, int edad, String estadoCivil, double sueldo, String cargo, Direccion direccion, Departamento departamento) {
        super(id, cedula, nombre, apellido, balance, edad, estadoCivil);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.direccion = direccion;
        this.departamento = departamento;
    }

    @Override

    public String toString() {
        return "Empleado: " + super.toString() + ", Cargo: " + cargo + ", Sueldo: " + sueldo;
    }
}
