import java.util.*;
public class Libromain {

	public static void main(String[] args) {
		Libro[] l = new Libro [4];

		l[0] = new Libro ("oscar", "pinocchio", 65000);
		l[1] = new Libro ("oscar", "i lupi", 105);
		l[2] = new Libro (" de amici", "cuore", 500);
		l[3] = new Libro ("vespa", "politica ", 1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("il libro col numero con pagine massime: " );
		int  i, max;
		max = l[0].getPagine();
		for (i = 0; i<l.length; i++ ) {
		if (l[i].getPagine()>max)
			{max= l[i].getPagine();
		}
		}
		System.out.println( max);
		System.out.println("scrivi un autore e guarda se è presente nell array: ");
		String autore= sc.nextLine();
		
		int  k=0;
		for (i = 0; i<l.length; i++ ) {
			if (l[i].getAutore().equals(autore)) {
			k++;
			}}
			System.out.println("compare volte " + k);
			
				
	}
	
	
	
	
}
