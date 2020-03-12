/**
 * @author Juan Manuel Marroquin Alfaro, Javier Alejandro Cotto Argueta
 * @param <opcion>
 * @Carne 19845,19324
 * @date 11/03/19
 * @name Factory.java
 **/

public class Cartas {
	
	private String nombre;
    private String tipo;
    private int cantidad;

    public Cartas(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
