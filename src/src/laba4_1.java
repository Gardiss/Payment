package src;
import java.util.*;

import src.Payment.Product;

import java.io.*;
public class laba4_1 {

	public static void main(String[] args) {
			int i=1;
			Scanner sc = null;
			System.out.println("|===============================================|");
			System.out.println("|№ товара |	Наименование	|	Цена	|");
			System.out.println("|===============================================|");
			{{
			    try {
			       sc = new Scanner(new File("notes3.txt"));
			    } catch (FileNotFoundException e) {
			        e.printStackTrace();
			    }
			    
			    
			    while(sc.hasNext()){
			        String line = sc.nextLine();
			        String[] playerData = line.split(":");
			       	System.out.println("|  "+i+".	  |	"+playerData[0]+"		|	"+playerData[1]+"	|");
			       	i++;
			    }
			    System.out.println("|===============================================|");
			    System.out.println();
			    }};
			    Scanner scan = new Scanner(System.in);

			    
			    
		Payment payment = new Payment();
		
		System.out.print(payment);
		System.out.println("|===============================================|");
		
		

	}

}
