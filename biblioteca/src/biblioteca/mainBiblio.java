package biblioteca;

import java.util.Arrays;

public class mainBiblio {

	public static void main(String[] args) {
		autore pluto[]= {
				new autore("oscar wilde", "wilde@gmail.com", 'm'),
				new autore("jk rowling", "hp@gmail.com", 'f'),
				new autore("federico moccia", "3msc@gmail.com", 'm'),
				new autore("dante alighieri", "laDivina@gmail.com", 'm'),	
		};
		libro book = new libro("pippo", 15, 1, pluto);
		//stampare gli autori
		//stampare il contenuto degli array Arrays.toString
		System.out.println(Arrays.toString(book.getAutori()));

	}

}
