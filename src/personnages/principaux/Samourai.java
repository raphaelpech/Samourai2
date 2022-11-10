package personnages.principaux;

public class Samourai extends Ronin{

	private String seigneur;
	
	public Samourai(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent);
		this.seigneur = seigneur;
		// TODO Auto-generated constructor stub
	}
	
	public void boire(String boisson)
	{
		parler("Mmm, un bon verre de " + boisson + "! Gloups!");
	}

}
