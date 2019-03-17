package src;

import java.util.*;
import java.io.*;

/**
 * Created by Сергей Гордиенко
 * Создать класс Payment (покупка) с внутренним классом, 
 * с помощью объектов которого можно сформировать 
 * покупку из нескольких товаров.
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
		 * Создаем лист в котором будут храниться
		 * все товары в магазине, их считываем из файла 
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
     * Создаем Список товаров выбранных пользователем
     *
     */
		public class Check{
 Scanner scan = new Scanner(System.in);
int s;

List<Product> check = new ArrayList<Product>();

		{ System.out.println("Введите номера товаров которые хотите приобрести: ");
			for(s=0;s<products.size();s++) {    		
			s=scan.nextInt();
			check.add(products.get(s-1));
			}
			int sum=0;
		    for (int i = 0; i < check.size(); i++) {
		    	System.out.println("В каком количестве вы хотите приобрести товар №: "+(i+1));
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
    System.out.println("|====================Список=====================|");
    return catalogLog.toString();
}
		}	
}
