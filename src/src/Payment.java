package src;

import java.util.*;
import java.io.*;

/**
 * Created by ������ ���������
 * ������� ����� Payment (�������) � ���������� �������, 
 * � ������� �������� �������� ����� ������������ 
 * ������� �� ���������� �������.
 */
	public class Payment {
		public static class Product{
		    String name;
		    String price;
		    int kolvo;

		    public Product(String name, String price, int kolvo) {
		        this.name = name;
		        this.price = price;
		        this.kolvo= 1;
		    }
		}
		
		
		/**
		 * ������� ���� � ������� ����� ���������
		 * ��� ������ � ��������, �� ��������� �� ����� 
		 */
		Scanner sc = null;
		List<Product> products = new ArrayList<Product>();
		
		
		 {
    try {
       sc = new Scanner(new File("notes3.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    
    
    while(sc.hasNext()){
        String line = sc.nextLine();
        String[] playerData = line.split(":"," ");
        products.add(new Product(playerData[0]+"	",playerData[1]+"	",1));
    }
    

    };
    /**
     * ������� ������ ������� ��������� �������������
     *
     */
		public class Check{
 Scanner scan = new Scanner(System.in);
int s;

List<Product> check = new ArrayList<Product>();

		{ System.out.println("������� ������ ������� ������� ������ ����������: ");
			for(s=0;s<products.size();s++) {    		
			s=scan.nextInt();
			check.add(products.get(s-1));
			}
			int sum=0;
		    for (int i = 0; i < check.size(); i++) {
		    	System.out.println("� ����� ���������� �� ������ ���������� ����� �: "+(i+1));
		    	s=scan.nextInt();
		    	check.get(i).kolvo = check.get(i).kolvo*s;
		        
		    }
		};
@Override
public String toString() {
    StringBuilder catalogLog = new StringBuilder();
    for (Product product : check){
        catalogLog.append("|  "+product.name+"	|	");
        catalogLog.append(product.price+" |	x");
        catalogLog.append(product.kolvo+"	|");
        catalogLog.append("\r\n");
        
    }
    System.out.println("|====================������=====================|");
    return catalogLog.toString();
}
		}	
}
