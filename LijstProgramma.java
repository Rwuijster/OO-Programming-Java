import java.util.ArrayList;
import verkiezingen.Stemmachine;
import verkiezingen.Partij;
import verkiezingen.Kandidaat;

public class LijstProgramma {
  public static void main(String[] args) {
    Stemmachine machine = new Stemmachine();
    machine.zetAan();
    
    ArrayList<Partij> partijlijst = machine.getPartijen();
    Partij laatstePartij = partijlijst.get(2);
    ArrayList<Kandidaat> kandidaatLijst = laatstePartij.getKandidaten();
    Kandidaat laatsteKandidaat = kandidaatLijst.get(4);
    
    System.out.println("De laatste Partij is: " + laatstePartij.getNaam());
    System.out.println("De laatste kandidaat is: " + laatsteKandidaat.getNaam());
    
    
    

  }
}
