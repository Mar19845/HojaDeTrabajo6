
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.stream.Collectors;

/**
 * @author Javier Cotto
 * @author Juan Marroquin
 */
public class Coleccion {
    /**
     * 
     */
    private Factory constructor;
    Map<String,Cartas> carta;
    public Coleccion() {
    }
    public void AsignarMapa (Map Datos){
        this.carta =Datos;
    }
    /**
     * Metodo que agrega una carta al maso 
     * @param karta 
     */
    public void AgregarCartas (Cartas karta){
        if(carta.containsKey(karta.getNombre())){
            karta.setCantidad(karta.getCantidad()+1);
        }
        carta.put(karta.getNombre(), karta);
    }
    /**
     * 
     * @param Nombre
     * @return 
     */
    public String MostrarCarta(String Nombre){
        String Respuesta = "";
        if(carta.containsKey(Nombre)){
            Cartas ejemplo = carta.get(Nombre);
            Respuesta = " La carta "+ Nombre + " es de tipo " + ejemplo.getTipo();
        }
        else{
            Respuesta = "La carta "+ Nombre + " no existe ";
        }
        return Respuesta;
    }
    /**
     * 
     */
    public void MostrarTodasLasCartas(){
        System.out.println("Todas las cartas son: ");
        for(Map.Entry<String, Cartas> ejemplo1 :carta.entrySet()){
            System.out.println("Nombre Carta: "+ ejemplo1.getKey() + " Tipo de Carta: "+ ejemplo1.getValue().getTipo() + " y la cantidad de cartas es: "+ ejemplo1.getValue().getCantidad());
        }
        System.out.println(" ");
    }
    /**
     * 
     * @param cartas 
     */
    public void RemoverCarta(Cartas cartas) {
        carta.remove(cartas);
    }
    /**
     * 
     * @param c
     * @return 
     */
    public Boolean CartaExistente(String c){
        if(carta.containsKey(c)){
            Cartas karta = carta.get(c);
            //System.out.println("Carta: " + carta.getNombre() +", Tipo: "+ carta.getTipo() +", Cantidad: "+ carta.getCantidad());
            return true;
        }else{ 
            return false;
        }
    }
   /**
    * 
    */
   public void mostrarCartasPorTipo(){
        String hechizos = "";
        String trampas = "";
        String monstruos = "";
        System.out.println("");
        System.out.println("Las cartas son: ");
        for (Map.Entry<String, Cartas> entry : carta.entrySet()){ 
            if (entry.getValue().getTipo().equals("Hechizo")) {
                hechizos += "Carta: " + entry.getKey() + " Tipo: " + entry.getValue().getTipo() + " Cantidad: " + entry.getValue().getCantidad() + "\n";
            } else if (entry.getValue().getTipo().equals("Trampa")) {
                trampas += "Carta: " + entry.getKey() + " Tipo: " + entry.getValue().getTipo() + " Cantidad: " + entry.getValue().getCantidad() + "\n";
            } else if (entry.getValue().getTipo().equals("Monstruo")) {
                monstruos += "Carta: " + entry.getKey() + " Tipo: " + entry.getValue().getTipo() + " Cantidad: " + entry.getValue().getCantidad() + "\n";
            }
            
        }
        
        System.out.println("Hechizos: ");
        System.out.println(hechizos);
        System.out.println("Trampa: ");
        System.out.println(trampas);
        System.out.println("Monstruos: ");
        System.out.println(monstruos);
        System.out.println("");
    }
   /**
    * 
    * @param nombre
    * @param tipo 
    */
    public void CrearCarta(String nombre, String tipo) {
        carta.put(nombre, new Cartas(nombre, tipo, 1));
    }
    /**
     * 
     * @param c
     * @return 
     */
     public Cartas getCarta(String c){
        if(carta.containsKey(c)){
            Cartas mazo = carta.get(c);
            return mazo;
        } else{
            return null;
        }
    }
}
