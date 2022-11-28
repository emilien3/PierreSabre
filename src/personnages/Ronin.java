package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1; 

	public Ronin(String nom, String boisson, int qttArgent) {
		super (nom, boisson, qttArgent);
	}
	
	public void donner(Commercant beneficiaire) {
		
		double give = qttArgent * 0.10 ;
		
		int argentDonner = (int)give;
		
		parler(beneficiaire.getNom() + " prend ces "+argentDonner+ " sous.");
		beneficiaire.gagnerArgent(argentDonner);
		beneficiaire.parler(argentDonner +" sous ! Je te remercie généreux donateur!");
		
	}
	
	
	public void provoquer(Yakusa yakusa) {
		int force = honneur*2;
		
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		
		if (force >= yakusa.getReputation() ) {
			parler("Je t’ai eu petit yakusa!");
			honneur+=1;
			gagnerArgent(yakusa.qttArgent);
			yakusa.perdre();
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			yakusa.gagner(qttArgent);
			perdreArgent(qttArgent);
			honneur-=1;
		}
	}

}



