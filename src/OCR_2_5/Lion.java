package OCR_2_5;

public class Lion extends Felin {
	 
	  public Lion(){

	  }

	  public Lion(String couleur, int poids){
	    this.couleur = couleur;
	    this.poids = poids;
	  }       
	 
	  void crier() {
	    System.out.println("Je rugis dans la savane !");
	  } 
}