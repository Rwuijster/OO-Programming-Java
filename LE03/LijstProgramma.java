import java.util.ArrayList;
import verkiezingen.Stemmachine;
import verkiezingen.Partij;
import verkiezingen.Kandidaat;

public class LijstProgramma {
  public static void main(String[] args) {
    Stemmachine machine = new Stemmachine();
    machine.zetAan();
    
    ArrayList<Partij> partijlijst = machine.getPartijen();
    int lijstLengte = partijlijst.size();
    Partij laatstePartij = partijlijst.get(lijstLengte - 1);
    ArrayList<Kandidaat> kandidaatLijst = laatstePartij.getKandidaten();
    int lengteKandidaatLijst = kandidaatLijst.size();
    Kandidaat laatsteKandidaat = kandidaatLijst.get(lengteKandidaatLijst - 1);
    
    System.out.println("De laatste Partij is: " + laatstePartij.getNaam());
    System.out.println("De laatste kandidaat is: " + laatsteKandidaat.getNaam());
    
    
    

  }
}
