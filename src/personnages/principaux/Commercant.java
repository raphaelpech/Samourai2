package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer()
	{
		perdreArgent(this.getArgent());
		parler("Le monde est trop injuste!");
		return 0;
	}
	
	public void recevoir(int n)
	{
		gagnerArgent(n);
		parler("Je te remercie, ronin!");
	}

}
