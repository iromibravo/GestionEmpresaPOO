package clases;

import interfaces.PagoEmpresa;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements PagoEmpresa {
    private String nombre;
    private String nit;
    private List<Departamento> departamentos; //arraylist
    private Direccion direccion;
    //Constructor

    public Empresa(String nombre, String nit, Direccion direccion) {
        this.nombre = nombre;
        this.nit = nit;
        departamentos = new ArrayList<>();
        this.direccion = direccion;
    }
    //Método Getter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    // Método Agregar Departamentos de la lista
    //recibe un parámetro de tipo Departamento llamado departamento
    //departamentos es una lista de objetos Departamento que almacena los departamentos integrados en la empresa.
    public void agregarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }
    //Método de la clase Departamento para Eliminar departamentos de la lista
    public void eliminarDepartamento(Departamento departamento){
        departamentos.remove(departamento);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", departamentos=" + departamentos +
                ", direccion=" + direccion +
                '}';
    }
    //Métodos de la Interfaz PagoEmpresa
    @Override
    public void cobrar() {
    }
    @Override
    public void pagar() {
    }
    @Override
    public void pagarImpuestos() {
        // Cálculo de impuestos basado en los ingresos o ganancias de la empresa
        double ingresosAnuales = calcularIngresosAnuales(); // Método para obtener los ingresos anuales de la empresa
        double impuestosAPagar = ingresosAnuales * 0.35; // impuesto del 35% en Colombia sobre los ingresos

        // Lógica para realizar el pago de impuestos
        boolean pagoExitoso = realizarPago(impuestosAPagar); // Método para realizar el pago en algún sistema de pago

        // Verificación del resultado del pago
        if (pagoExitoso) {
            System.out.println("La Empresa"+" "+ getNombre()+" "+"ha realizado el pago del 35% de impuestos en Colombia por un Monto de: " + impuestosAPagar+ " "+"$");
        } else {
            System.out.println("No se pudo realizar el pago de impuestos");
        }
    }
    private boolean realizarPago(double impuestosAPagar) {
        return true;
    }
    private double calcularIngresosAnuales() {
        return 12000000;
    }
}
