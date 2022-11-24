package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1; 

	public Ronin(String nom, String boisson, int qttArgent) {
		super (nom, boisson, qttArgent);
		this.honneur = honneur; 
	}
	
	public void donner(Commercant beneficiaire) {
		double argentDonner = qttArgent * 0.10 ;
		parler(beneficiaire + " prend ces "+argentDonner+ " sous.");
		beneficiaire.parler(argentDonner +" sous ! Je te remercie généreux donateur!");
	}
}
