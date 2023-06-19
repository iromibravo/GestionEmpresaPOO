package clases;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String identificador;
    private CategoriaDpto categoria;
    private String localizacion;
    private Empresa empresa;
    private List<Empleado> empleados;// lista de objetos Empleado que representa a los empleados que trabajan en el departamento.

    //constructor
    public Departamento(String nombre, String identificador, CategoriaDpto categoria, String localizacion, Empresa empresa) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.categoria = categoria;
        this.localizacion = localizacion;
        this.empresa = empresa;
        this.empleados = new ArrayList<>();
        empresa.agregarDepartamento(this);
    }


    //Setter
    /*
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public CategoriaDpto getCategoria() {
        return categoria;
    }
    public void setCategoria(CategoriaDpto categoria) {
        this.categoria = categoria;
    }
    // Getter
    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public List<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }*/
    //Método de la clase Departamento para Agregar empleados a la lista
    //recibe un parámetro de tipo Empleado llamado empleado
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
        empleado.setDepartamento(this);
    }
    //Método de la clase Departamento para Eliminar empleados de la lista
    public void eliminarEmpleado(Empleado empleado){
        empleados.remove(empleado);
        empleado.setDepartamento(null);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", identificador='" + identificador + '\'' +
                ", categoria=" + categoria +
                ", localizacion='" + localizacion + '\'' +
                ", empresa=" + empresa.getNombre() +
                '}';// Mostrar solo el nombre de la empresa

    }

}
