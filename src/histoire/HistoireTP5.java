package histoire;
import personnages.*;

public class HistoireTP5 {
	
	
	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakusa yaku = new Yakusa("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		
		//Partie 1
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		
		//Partie 2
//		yaku.direBonjour();
	
		//Partie 3
		
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissance();
		
//		akimoto.boire("thé");
		
		//Partie 4
		
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		
		masako.faireConnaissanceAvec(akimoto);
		
		masako.ranconner(kumi);
		
		masako.faireConnaissanceAvec(yaku);
		
		masako.faireLeGentil();
		
		masako.faireConnaissanceAvec(roro);
	}

}
