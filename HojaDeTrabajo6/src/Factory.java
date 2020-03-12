
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Juan Marroquin
 */
public class Factory {

    public Factory() {
    }
    public static Map<String, Cartas> obtenerMap(String opcion){
        switch (opcion){
            case "1":
                return new HashMap<String, Cartas>();
            case "2":
                return new HashMap<String, Cartas>();
            case "3":
                return new LinkedHashMap<String, Cartas>();
            default:
                return null;
        }
    }
}
