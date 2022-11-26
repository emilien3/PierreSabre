package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1; 

	public Ronin(String nom, String boisson, int qttArgent) {
		super (nom, boisson, qttArgent);
		this.honneur = honneur; 
	}
	
	public void donner(Commercant beneficiaire) {
		
		double give = qttArgent * 0.10 ;
		
		int argentDonner = (int)give;
		
		parler(beneficiaire.getNom() + " prend ces "+argentDonner+ " sous.");
		beneficiaire.gagnerArgent(argentDonner);
		beneficiaire.parler(argentDonner +" sous ! Je te remercie généreux donateur!");
		
	}
}
