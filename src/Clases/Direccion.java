package Clases;

public  class Direccion {
    private String calle;
    private int numero;
    private int codigoPostal;
    private String localidad;
    private String ciudad;

    public Direccion(String calle, int numero, int codigoPostal, String localidad, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion {" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", codigoPostal=" + codigoPostal +
                ", localidad='" + localidad + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
