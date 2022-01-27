package Products;

import java.util.Date;
public class ProductTests 
{
	public static void main(String[] args)
    
	{
        
		Date d1 = new Date(2025,10,10);
		Date d2 = new Date(2021,10,10);
		Date d3 = new Date(2020,10,10);

		
        
		Product p1 = new Product("A0",100,d1);
		Product p2 = new Product("A0",100,d2);
		Product p3 = new Product("A0",100,d3);

        
		if(p1.checkExpired() == false);
				System.out.println("Pog");
		if(p2.checkExpired()==true);
		System.out.println("POG");

    
	}

}

