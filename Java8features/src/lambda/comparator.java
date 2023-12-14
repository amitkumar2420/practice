package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Product{  
    int id;  
    String name;  
    double price;  
    public Product(int id, String name, double price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class comparator {
	 public static void main(String[] args) {
//		 List<Product> list=new ArrayList<Product>();  
//         
//	        //Adding Products  
//	        list.add(new Product(1,"HP Laptop",25000f));  
//	        list.add(new Product(3,"Keyboard",300f));  
//	        list.add(new Product(2,"Dell Mouse",150f));  
//	          
//	        System.out.println("Sorting on the basis of name...");  
//	  
//	        // implementing lambda expression  
//	        Collections.sort(list,(p1,p2)->{  
//	        return p1.name.compareTo(p2.name);  
//	        });  
//	        for(Product p:list){  
//	            System.out.println(p.id+" "+p.name+" "+p.price);  
//	        }  
		 Scanner sc=new Scanner(System.in);
		 
		 List<Product>list=new ArrayList<Product>();
		 for(int i=0;i<3;i++) {
		 System.out.println("Enter details");
		 	int id=sc.nextInt();
		 	String name=sc.next();
		 	double f=sc.nextDouble();
		 	list.add(new Product(id,name,f));
		 }
		 System.out.println("Sorting on the basis of name...");
		 Collections.sort(list,(p1,p2)->{
			 return p1.name.compareTo(p2.name);
		 });
		 for(Product p:list) {
			 System.out.println(p.id+" "+p.name+" "+p.price);
		 }
		 
	 }
}
