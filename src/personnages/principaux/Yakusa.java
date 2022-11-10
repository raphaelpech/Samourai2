package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain{

	private String clan;
	private int reputation;
	
	public Yakusa(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
		// TODO Auto-generated constructor stub
	}
	
	public String getClan()
	{
		return this.clan;
	}
	
	public int getReputation()
	{
		return this.reputation;
	}
	
	public void extorquer(Commercant c)
	{
		c.seFaireExtorquer();
		reputation++;
		parler("Je t'ai bien eu!");
	}
	
	public void gagnerDuel()
	{
		reputation++;
		parler("C'est gagné haha!");
	}
	
	public int perdreDuel()
	{
		super.perdreArgent(getArgent());
		reputation--;
		parler("Arrgh, j'ai perdu mon duel...");
		return 0;
	}

}
