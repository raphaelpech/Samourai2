package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{

	private int honneur;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1;
		// TODO Auto-generated constructor stub
	}

	public void donner(int n, Commercant c)
	{
		parler("Voici de l'argent, commerçant!");
		c.recevoir(n);
	}
	
	public void provoquer(Yakusa y)
	{
		if(this.honneur * 2 >= y.getReputation())
		{
			y.perdreDuel();
			honneur++;
			parler("Tu as perdu, yakusa!");
		}else
		{
			y.gagnerDuel();
			honneur--;
			parler("Tu as été trop fort pour moi...");
		}
	}
}
