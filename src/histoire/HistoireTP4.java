package histoire;
import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {

//		Exercice 1:		
//		Humain prof = new Humain("Prof","kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("kombucha", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
		
//		Exercice 2:		
		Commercant marco = new Commercant("Marco", 15);
//		marco.direBonjour();
//		marco.seFaireEscroquer();
//		marco.recevoir(15);
//		marco.boire();

		
//		Exo 2.2
		
		Yakusa yaku = new Yakusa ("Yaku le noir","whiskey" ,30, "Warsong"); 
		yaku.direBonjour();
		
		yaku.extorquer(marco);
		
		}

}
