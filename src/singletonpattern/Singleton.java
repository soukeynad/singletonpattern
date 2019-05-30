package singletonpattern;

public final class Singleton {
	 
	     // L'utilisation du mot cl� volatile, en Java version 5 et sup�rieure,
	     // permet d'�viter le cas o� "Singleton.instance" est non nul,
	  
	     private static volatile Singleton instance = null;
	 
	     // D'autres attributs, classiques et non "static".
	     private String xxx;
	     private int zzz;

	     /**
	      * Constructeur de l'objet.
	      */
	     private Singleton() {
	         // La pr�sence d'un constructeur priv� supprime le constructeur public par d�faut.
	         // De plus, seul le singleton peut s'instancier lui-m�me.
	         super();
	     }
	     
	     /**
	      * M�thode permettant de renvoyer une instance de la classe Singleton
	      * @return Retourne l'instance du singleton.
	      */
	     public final static Singleton getInstance() {
	         //Le "Double-Checked Singleton"/"Singleton doublement v�rifi�" permet 
	         //d'�viter un appel co�teux � synchronized, 
	         //une fois que l'instanciation est faite.
	         if (Singleton.instance == null) {
	         // Le mot-cl� synchronized sur ce bloc emp�che toute instanciation
	            // multiple m�me par diff�rents "threads".
	           
	            synchronized(Singleton.class) {
	              if (Singleton.instance == null) {
	                Singleton.instance = new Singleton();
	              }
	            }
	         }
	         return Singleton.instance;
	     }
	     // D'autres m�thodes classiques et non "static".
	     public void faireXxx() {
	       
	       this.xxx = "bonjour";
	     }

	     public void faireZzz() {
	       
	     }
	    
	    
	 }

