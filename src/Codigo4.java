import java.util.Scanner;

public class Codigo4 {
	
	public static void main(String[] args) { //Se añadio lo de publicstatic y llave faltante
	    Scanner s = new Scanner(System.in); // se importo Scanner y se definio en (),
	    
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    // Scanner = new Scanner();  esto no va
	    String j2 = s.nextLine();
	    
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }
	          break; // se agrego break faltante

	        case "papel":
	          if (j2 == ("piedra")) { //Se añadio un )
	            g = 1;
	            } // se añadio }
	          break; //se agrego break faltante
	          
	        case "tijeras": //Se puso la s de tijeras
	          if (j2 == ("papel")) { //se quito equals y se puso == como en los otros
	            g = 1;
	          }
	          break;
	        default:
	      } //default
	      System.out.println("Gana el jugador " + g);
	    }
	  s.close(); //se agregó cierre de scanner  
	}
} // class código 4
