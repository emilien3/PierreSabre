package personnages;

public class Yakusa extends Humain {
	
	private int reputation = 0;
	private String clan;
	
	public Yakusa(String nom, String boisson, int qttArgent, String clan) {
		super(nom, boisson, qttArgent);
		this.clan = clan ;
	}
	
	public void extorquer(Commercant victime){
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		
		int argentVole = victime.getQttArgent();
		qttArgent += argentVole;
		
		victime.seFaireEscroquer();
		reputation += 1;
		
		parler("J'ai piqué les "+ argentVole+ " sous de "+victime.getNom()+ ", ce qui me fait "+qttArgent+" sous dans ma poche. Hi! Hi! ");
	}
	
}
