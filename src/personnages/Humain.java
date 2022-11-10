package personnages;

public class Humain {
	
	private String nom;
	private String boisson;
	private int argent;
	
	/* Constructeurs */
	public Humain(String nom, String boisson, int argent)
	{
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	/* Méthodes */
	public void parler(String texte)
	{
		System.out.println(getNom() + "-" + texte);
	}
	
	public void direBonjour()
	{
		parler("Bonjour ! Je m'appelle " + getNom() + ", j'aime boire du " + getBoisson() + ", et j'ai " + getArgent() + " sous en poche!");
	}
	
	public void boire()
	{
		parler("Mmm, un bon verre de " + getBoisson() + "! Gloups!");
	}
	
	public void gagnerArgent(int n)
	{
		argent += n;
	}
	
	public void perdreArgent(int n)
	{
		argent -= n;
	}
	
	/* Getters */
	public String getNom()
	{
		return this.nom;
	}
	
	public String getBoisson()
	{
		return this.boisson;
	}
	
	public int getArgent()
	{
		return this.argent;
	}
	

}
