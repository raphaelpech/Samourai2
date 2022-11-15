package histoires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.principaux.Yakusa;
import personnages.secondaires.GrandMere;
import personnages.secondaires.Traitre;

public class MonHistoire {
	

	public static void main(String [] args) {    
		  Humain humain = new Humain("Prof", "Porto", 10);
		  humain.direBonjour();
		  humain.boire();
		  Commercant commercant = new Commercant("Marchand", 35);
		  commercant.direBonjour();
		  Yakusa yakusa = new Yakusa("Yaku␣le␣noir", "bière", 42, "WarSong");
		  yakusa.direBonjour();
		  yakusa.extorquer(commercant);
		  commercant.direBonjour();
		  Ronin ronin = new Ronin("Roro", "sake", 61);
		  ronin.donner(10, commercant );
		  ronin.provoquer(yakusa);
		  ronin.direBonjour();
		  Ronin musaichi = new Samourai("Akimoto" , "thé" , 20, "Miyamoto");
		  musaichi.direBonjour();
		  musaichi.provoquer(yakusa);
		  Samourai sam = (Samourai) musaichi;
		  sam.boire("Vin");
		  sam.direBonjour();
		  Traitre traitre = new Traitre("Judas", "Coca-cola", 47, "Jesus");
		  traitre.extorquer(commercant);
		  traitre.direBonjour();
		  traitre.faireLeGentil(yakusa, 47);
		  GrandMere gm = new GrandMere("Mamie Nova");
		  gm.direBonjour();
		  gm.faireConnaissanceAvec(commercant);
		  gm.faireConnaissanceAvec(yakusa);
		  gm.faireConnaissanceAvec(ronin);
		  gm.faireConnaissanceAvec(musaichi);
		  gm.faireConnaissanceAvec(traitre);
		  gm.ragoter();
		  // Arret TD1 : après GrandMere

	}


}
