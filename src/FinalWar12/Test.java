package FinalWar12;

import com.sdz.comportement.Courir;
import com.sdz.comportement.Operation;

class Test{
	  public static void main(String[] args) {
	    Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};
			
	    for(int i = 0; i < tPers.length; i++){
	      System.out.println("\nInstance de " + tPers[i].getClass().getName());
	      System.out.println("*****************************************");
	      tPers[i].combattre();
	      tPers[i].seDeplacer();
	      tPers[i].soigner();
	    }
	    
	    System.out.println("*****************************************");
	    Personnage pers = new Guerrier();
	    pers.soigner();		
	    pers.setSoin(new Operation());
	    pers.soigner();
	    pers.seDeplacer();
	    pers.setDeplacement(new Courir());
	    pers.seDeplacer();
	  }
	}