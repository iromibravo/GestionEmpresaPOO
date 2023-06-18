package Clases;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String nit;
    private List<Departamento> departamentos; //arraylist
    private Direccion direccion;
    //Constructor

    public Empresa(String nombre, String nit, Direccion direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.departamentos = new ArrayList<>();
        this.direccion = direccion;
    }
    //Método Getter
    public String getNombre() {
        return nombre;
    }
    public String getNit() {
        return nit;
    }
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public Direccion getDireccion() {
        return direccion;
    }

    //Método Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
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
}
