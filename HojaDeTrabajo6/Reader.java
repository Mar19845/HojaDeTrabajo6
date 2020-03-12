import java.io.*;
import java.util.*;

/**
 * @author Juan Manuel Marroquin Alfaro, Javier Alejandro Cotto Argueta
 * @param <opcion>
 * @Carne 19845,19324
 * @date 11/03/19
 * @name Factory.java
 **/

public class Reader {

	    static ArrayList<String> list;
	    static String[] parts;

		public static ArrayList<String> Reader(){
	        list = new ArrayList<String>();

			String fileName = "cards_desc.txt";

	        String line = null;

	        try {

	            FileReader fileReader = 
	                new FileReader(fileName);

	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                parts = line.split("\\|");
	                list.add(parts[0]);
	                parts = null;
	            }   

	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");                  
	        }
	        return list;
	    }

	    public static ArrayList<String> Reader2(){
	        list = new ArrayList<String>();

			String fileName = "cards_desc.txt";

	        String line = null;

	        try {

	            FileReader fileReader = 
	                new FileReader(fileName);

	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                parts = line.split("\\|");
	                list.add(parts[1]);
	                parts = null;
	            }   

	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");                  
	        }
	        return list;
	    }
	}
