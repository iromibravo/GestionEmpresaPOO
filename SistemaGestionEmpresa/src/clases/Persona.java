package clases;
import interfaces.Pago;

public abstract class Persona implements Pago {
    private String id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String balance;
    private int edad;
    private String estadoCivil;

    //Constructor
    public Persona(String id, String cedula, String nombre, String apellido, String balance, int edad, String estadoCivil) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.balance = balance;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    //GETTER AND SETTER
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    // Implementación de los métodos de la interfaz PagoEmpleado
    private double getSueldoBruto() {
        return 0;
    }
    public double calcularSueldoNeto(double porcentajeRetencion) {
        double retencion = porcentajeRetencion * getSueldoBruto() / 100.0;
        return getSueldoBruto() - retencion;
    }
    @Override
    public void cobrar() {
        double sueldoNeto = calcularSueldoNeto(25.0); // Ejemplo de aplicar una retención del 10%
        System.out.println("El empleado cobra: " + sueldoNeto);
    }

    // Implementación del método adicional de la interfaz PagoCliente
    public void contratarServicio(Empresa empresa, Empleado empleado) {
        System.out.println("Contratando servicio con la empresa: " + empresa.getNombre());
        System.out.println("Empleado asignado para la atención: " + empleado.getNombre() + " " + empleado.getApellido());

    }
    @Override
    public String toString() {
        return
                "id =" + id + "\n" +
                "cedula ='" + cedula + "\n" +
                "nombre =" + nombre + "\n" +
                "apellido =" + apellido + "\n" +
                "balance =" + balance + "\n" +
                "edad =" + edad + "\n" +
                "estadoCivil =" + estadoCivil ;
    }
}
