
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
    public void MostrarTodasLasCartas(){
        System.out.println("Todas las cartas son: ");
        for(Map.Entry<String, Cartas> ejemplo1 :carta.entrySet()){
            System.out.println("Nombre Carta: "+ ejemplo1.getKey() + " Tipo de Carta: "+ ejemplo1.getValue().getTipo() + " y la cantidad de cartas es: "+ ejemplo1.getValue().getCantidad());
        }
        System.out.println(" ");
    }
}
