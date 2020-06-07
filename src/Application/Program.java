package Application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		System.out.println("=== Test findById ====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2 findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
		System.out.println(obj);
		}
		
		System.out.println("\n=== Test 3 findAll ====");
		list = sellerDao.findAll();
		for(Seller obj : list) {
		System.out.println(obj);
		}
		
		System.out.println("\n=== Test 4 INSERT ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Novo Vendedor incluso: " + newSeller.getId());
		
		System.out.println("\n=== Test 5 UPDATE ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.upDate(seller);
		System.out.println("UpDate Completo!" + seller);
		
		}

}
