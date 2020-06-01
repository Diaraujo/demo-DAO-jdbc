package Application;

import java.util.Date;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Diogo", "diogo@gmail.com", new Date(), 5000.0, obj);
		System.out.println(seller);
		
	}

}
