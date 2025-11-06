package models;
/*
* Clase que funciona como modelo dentro de nuestra aplicacion web
* */


public class Producto {
    //Encapsulamos y declaramos las variables del objeto producto
    private Long idProducto;
    private String nombre;
    private String tipo;
    private double precio;

    //Generamos un constructor vacio para inicializar la clase
    public Producto() {}

    //Generamos un constructor y le damos los parametros coorrespondientes para crear un objeto
    public Producto(Long idProducto, String nombre, String tipo, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    // Creamos getters y setters para acceder a las variables que se encuentran privadas y de ser
    // necesario las modifica

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
