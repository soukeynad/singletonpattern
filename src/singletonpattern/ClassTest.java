package singletonpattern;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Il ne faut pas copier un singleton dans une variable locale sauf dans les cas d'optimisations extrêmes.
		   Singleton.getInstance().faireXxx();
		   Singleton.getInstance().faireZzz();

	}

}
