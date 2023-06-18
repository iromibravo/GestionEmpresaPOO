package Clases;

public abstract class Persona {
    private String id;
    private int cedula;
    private String nombre;
    private String apellido;
    private String balance;
    private int edad;
    private String estadoCivil;

    //Constructor
    public Persona(String id, int cedula, String nombre, String apellido, String balance, int edad, String estadoCivil) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.balance = balance;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    public String getId() {
        return id;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getBalance() {
        return balance;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", balance='" + balance + '\'' +
                ", edad=" + edad +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
