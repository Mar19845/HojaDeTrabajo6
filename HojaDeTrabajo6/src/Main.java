import java.util.*;

/**
 * @author Juan Manuel Marroquin Alfaro, Javier Alejandro Cotto Argueta
 * @param <opcion>
 * @Carne 19845,19324
 * @date 11/03/19
 * @name Factory.java
 **/

public class Main {

	public static void main(String [] args) {
		//Listas a utilizar
		ArrayList<String> nombreCartas = new ArrayList<String>();
		ArrayList<String> type = new ArrayList<String>();
		Map<String, String> map = null;
		
		//Variables a utilizar
    	Scanner sc = new Scanner(System.in);
    	String input = null;
		Factory factory = new Factory();
		int opc;
		Iterator<String> ite;
		String nombre;
		String tipo;
		boolean valido = false;
    	Reader file = new Reader();
    	
    	//Encabezado
    	System.out.println("_____-----Hoja de Trabajo #6-----_____\n");
    	System.out.println("Que implementación de MAP quiere utilizar\n");
    	System.out.println("1. HashMap, 2. TreeMap, 3. LinkedHashMap");
    	input = sc.nextLine();
    	Factory.obtenerMap(input);
    	
    	//Separar el nombre de las cartas
    	nombreCartas = Reader.Reader();
    	
    	//Separar el tipo de la carta
    	type = Reader.Reader2();
    	
    	//Mostrar el map con un iterador
    	ite = map.keySet().iterator();
    	while(ite.hasNext()) {
    		String key = ite.next();
    		System.out.println("Nombre Carte; " + key + " Tipo: " + map.get(key));
    		
    	System.out.println("\n FIN Ejecución del Arbol \n");
    	
    	
    	//Menu de opciones disponibles
    	System.out.println("_____-----MENU-----_____\n");
        System.out.println("1. Agregar una carta a la coleccion");
        System.out.println("2. Mostrar el tipo de una carta específica en la coleccion");
        System.out.println("3. Mostrar el nombre, tipo y cantidad de cada cartas en la coleccion");
        System.out.println("4. Mostrar el nombre, tipo y cantidad de cada cartas que tiene en su colección, ordenadas por tipo.");
        System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
    	System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
    	System.out.println("Seleccione una opción");
    	opc = sc.nextInt();
    	 
    	//Llamar metodos de cada opción
    	if(opc == 1) {
    		
    	}
    	
    	if(opc == 2) {
    		
    	}
    	
    	if(opc == 3) {
	
    	}
    	
    	if (opc == 4) {

			System.out.println("4. Mostrar el nombre, tipo y cantidad de cada cartas que tiene en su coleccion, ordenadas por tipo.");
			for(int i=0; i<nombreCartas.size();i++){
				map.put(nombreCartas.get(i),type.get(i));
			}
			ite = map.keySet().iterator();
			while(ite.hasNext()){
				String key1 = ite.next();
				System.out.println("Tipo: (" + key1 + ") -> Nombre Carta: (" + map.get(key1)+")");     
			}
			System.out.println("Hay: "+map.size() + " cartas en su coleccion");

	   }

	   if (opc == 5) {

			System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
			for(int i=0; i<nombreCartas.size();i++){
				map.put(nombreCartas.get(i),type.get(i));
			}

			ite = map.keySet().iterator();
			while(ite.hasNext()){
			   String key1 = ite.next();
			   System.out.println("Nombre Carta: " + key1 + " -> Tipo: " + map.get(key1));
			}

			System.out.println("---------------------------------");   
	   }

	   if (opc == 6) {
			System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");

			Collections.sort(type);
			for(int i=0; i<nombreCartas.size();i++){
				map.put(nombreCartas.get(i),type.get(i));
			}
			
			ite = map.keySet().iterator();
			while(ite.hasNext()){
				String key1 = ite.next();
				System.out.println("Nombre Carta: " + key1 + " -> Tipo: " + map.get(key1));   
		   }
		}
    	}
    	
	}
	
}