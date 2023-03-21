package Esercizio1;

import java.util.HashSet;
import java.util.Set;

public class Programma {

	int num;
	Set<String> arr;
	
	public Programma() {
		this.setNum();
		this.CreaArray();
	}
	

	public void setNum() {
		System.out.println("Inserisci un numero");
		this.num = Runnable.s.nextInt();
		Runnable.s.nextLine();
	}
	
	public void CreaArray() {
		int a = this.num;
		Set<String> arr = new HashSet<String>();
		
		while(arr.size() < a) {
			System.out.println("Inserisci la parola n: " + arr.size());
			String b = Runnable.s.nextLine();
			arr.add(b);
		}
		
		//for(int i = 0; i < arr.size(); i++) {
			//System.out.println("Inserisci la parola n: " + (i + 1));
			///String b = Runnable.s.nextLine();
			//arr.add(b);
		//}
		System.out.println(arr.toString());
	}
}
