package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai {

	private int traitrise;
	
	public Traitre(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent, seigneur);
		// TODO Auto-generated constructor stub
		this.traitrise = 0;
	}
	
	public void extorquer(Commercant c)
	{
		if(this.traitrise >= 3)
		{
			parler("Je ne peux pas extorquer plus!");
		}else
		{
			c.seFaireExtorquer();
			traitrise++;
			parler("Héhé je t'ai tout pris!");
		}
	}
	
	public void direBonjour()
	{
		super.direBonjour();
		parler("J'ai un niveau de traîtrise de " + traitrise + ".");
	}
	
	public void faireLeGentil(Humain h, int argent)
	{
		if(argent <= getArgent())
		{
			parler("Voici de l'argent pour toi: " + argent + " sous!");
			h.parler("Merci, traître!");
			traitrise = traitrise - (argent / 10);
			if(traitrise < 0)
			{
				traitrise = 0;
			}
			h.gagnerArgent(argent);
			perdreArgent(argent);
		}else
		{
			parler("Je n'ai pas autant d'argent à donner.");
		}
		
	}
	

}
