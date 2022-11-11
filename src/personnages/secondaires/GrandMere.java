package personnages.secondaires;

import personnages.Humain;
import java.util.Random;

public class GrandMere extends Humain{

	private Humain [] memoire = new Humain [30];
	private int nbConnaissances;
	private Random rand = new Random();
	
	public GrandMere(String nom) {
		super(nom, "tisane", 0);
		this.nbConnaissances = 0;
		// TODO Auto-generated constructor stub
	}
	
	private String humainHasard()
	{
		String str = null;
		int r = rand.nextInt(0, 6);
		switch(r)
		{
			case 0:
				str = "commerçant";
				break;
			case 1:
				str = "ronin";
				break;
			case 2:
				str = "samouraï";
				break;
			case 3:
				str = "yakusa";
				break;
			case 4:
				str = "grand-mere";
				break;
			default:
				str = "ronin";
				break;
		}
		return str;
	}
	
	public void faireConnaissanceAvec(Humain humain)
	{
		if(nbConnaissances > 30)
		{
			parler("Ma mémoire ne peut contenir tant de connaissances...");
		}else
		{
			memoire[nbConnaissances] = humain;
			nbConnaissances++;
		}
	}
	
	public void ragoter()
	{
		for(int i = 0; i < nbConnaissances; i++)
		{
			if(memoire[i] instanceof Traitre)
			{
				parler("Je sais que " + memoire[i].getNom() + " est un traître!");
			}else
			{
				parler("Je crois que " + memoire[i].getNom() + " est un(e) " + humainHasard() + "...");
			}	
		}
	}

}
