package Esercizio2;

import java.util.ArrayList;

public class Lista {

	private int num;
	ArrayList<Integer> arr;

	public Lista() {
		this.setNum();
		this.creatArray();
	}
	
	public void setNum() {
		System.out.println("Inserisci un numero");
		this.num = Runnable.s.nextInt();
	}
	
	public void creatArray() {
		int n = this.num;
		this.arr = new ArrayList<Integer>();
		while(arr.size() < n ) {
			int b =(int)( Math.random() * 100) + 1;
			arr.add(b);		
		}
		System.out.println(arr.toString());
	}
	
	public void stampaPariODispari(ArrayList<Integer> arr) {
		
		//ArrayList<Integer> risultato = new ArrayList<Integer>();
		System.out.println("inserisci true o false");
		Boolean b = Runnable.s.hasNextBoolean();
		
		if(b) {
			for(int i = 0; i < arr.size(); i++) {
				if(i + 1 % 2 != 0) {
					arr.remove(i);
				}
			}
			System.out.println(arr.toString());
		} else {
			for(int i = 0; i < arr.size(); i++) {
				if(i + 1 % 2 == 0) {
					arr.remove(i);
				}
			}
			System.out.println(arr.toString());
		}
	}

	
}
