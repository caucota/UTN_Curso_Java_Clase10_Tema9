package org.caucotafederico.Clase10Tema9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.caucotafederico.Clase10Tema9.models.Persona;

public class App 
{
    public static void main( String[] args )
    {
    	List<Persona> listadoPersona = new ArrayList<Persona>();
    	Scanner sc = new Scanner(System.in);
    	int opcion = -1;
    	String datoString = "";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	
    	while (opcion != 0) {
    		System.out.println("ELIJA UNA DE ESTAS OPCIONES:");
    		System.out.println("1: Para ingresar los datos de una nueva persona");
    		if (listadoPersona.size() > 0) {
    			System.out.println("2: Listar las personas ingresadas");
    		}
    		System.out.println("0: Para Salir del programa");
    		opcion = sc.nextInt();
    		if (opcion == 1) {
    	        Persona persona = new Persona();
    			datoString = sc.nextLine();
    			System.out.println("Ingrese el Apellido y presione Enter para confirmar");
    			datoString = sc.nextLine();
    	        persona.setApellido(datoString);
    			System.out.println("Ingrese el Nombre y presione Enter para confirmar");
    			datoString = sc.nextLine();
    	        persona.setNombre(datoString);
    			System.out.println("Ingrese la Fecha de Nacimiento (dd/MM/yyyy) y presione Enter para confirmar");
    			datoString = sc.nextLine();
    	        persona.setFechaNacimiento(LocalDate.parse(datoString, formatter));
    	        listadoPersona.add(persona);
    		}
    		
	        
    		if (opcion == 2) {
	        	System.out.println("-----------------------------");
	        	System.out.println("LISTADO DE PERSONA INGRESADAS");
		        for(Persona unaPersona : listadoPersona) {
		        	System.out.println(unaPersona.getApellido() + ", " + unaPersona.getNombre() + " F.Nac.: " +  unaPersona.getFechaNacimiento().format(formatter));
		        	opcion = 0;
		        }
	        	System.out.println("-----------------------------");
	        }
    	}
    	System.out.println("FIN DEL PROGRAMA");
    	sc.close();
    }
}
