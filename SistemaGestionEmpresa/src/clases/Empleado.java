package clases;

import interfaces.PagoEmpleado;
public class Empleado extends Persona{

    private double sueldo;
    private String cargo;
    private Direccion direccion;
    private Departamento departamento;

    //constructor que recibe por argumento los datos

    public Empleado(String id, String cedula, String nombre, String apellido, String balance, int edad, String estadoCivil, double sueldo, String cargo, Direccion direccion, Departamento departamento) {
        super(id, cedula, nombre, apellido, balance, edad, estadoCivil);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.direccion = direccion;
        departamento.agregarEmpleado(this);
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
@Override
      public String toString() {
        return "Empleado:\n" +
                super.toString() + "\n" +
                "Sueldo: " + sueldo + "\n" +
                "Cargo: " + cargo + "\n" +
                "Dirección: " + direccion.toString() + "\n" +
                "Departamento: " + departamento;
    }

    @Override
    public void cobrar() {
        System.out.println("El empleado " + getNombre() + " está cobrando sueldo: " + calcularSueldoNeto(0.25));
    }

    @Override
    public void pagar() {
        System.out.println("El empleado " + getNombre() + " está pagando sus gastos.");
    }

}
