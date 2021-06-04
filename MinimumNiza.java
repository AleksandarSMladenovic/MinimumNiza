package klaseTotale1;

import java.util.Scanner;

public class MinimumNiza {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza: ");
		int brojElemenata = sc.nextInt();

		if (brojElemenata <= 0) {
			System.out.println("Pogresan unos. Kraj programa!");
		}

		int[] niz = new int[brojElemenata];

		unosNiza(brojElemenata, niz);
		System.out.println("Minimum niza je " + min(niz));
		System.out.println("Broj ponavljanja minimalnog elementa niza je " + brojPonavljanjaMin(niz));

	}

	public static void unosNiza(int brojElemenata, int[] niz) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < brojElemenata; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza:");
			niz[i] = sc.nextInt();
		}
	}

	public static int min(int[] niz) {
		int min = niz[0];

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < min) {
				min = niz[i];
			}
		}
		return min;
	}

	public static int brojPonavljanjaMin(int[] niz) {
		int min = min(niz);
		int brojac = 0;
		
		for (int i = 0; i < niz.length; i++) {
			if(niz[i] == min) {
				brojac ++;
			}
		}
		return brojac;
	}
}
/*
 * Napisati program na programskom jeziku Java koji sluzi za pronalazenje minimuma u nizu. Korisnik preko standardnog ulaza unosi
 * duzinu niza, a zatim i elemente niza koji su celi brojevi. Ukoliko korisnik unese nevalidnu vrednost za duzinu niza ispisati
 *  poruku o tome i prekinuti izvrsavanje programa. Pretpostaviti da ce korisnik uneti prirodne brojeve za elemente niza.
 *   Ucitavanje niza izvrsiti u zasbnoj funkciji. Napisati funkciju minimum kojoj se prosledjuje uneti niz. 
 *   Funkcija pronalazi minimalan element niz i vraca njegovu vrednost. Napisati funkciju ponavljanja kojoj se prosledjuje 
 *   zadati niz i koja vraca broj ponavljanja minimalnog elemenata niza (npr za niz 1 2 4 1 6 1 vraca 3). 
 *   Ispisati na standardni izlaz minimalni element i broj njegovih ponavljanja.		 * 
 */