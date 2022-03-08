package Data;

import java.util.Vector;

public class Cursa {
	
	Traseu traseu;
	Vector<Masina> masini;
	
	public Cursa(int nr_masini)
	{
		masini=new Vector<Masina>(nr_masini);
	}

	public static void main(String[] args) {
		if(args.length>=2)
		{
			System.out.println(" Cursa " + args[0] + " " + args[1]);
		}

	}

}
