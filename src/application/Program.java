package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\n===== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===== TEST 2: seller findByDepartment =====");
		List<Seller> sellList = sellerDao.findByDepartmentId(2);
		for(Seller sl : sellList) {
			System.out.println(sl);
		}
		
		System.out.println("\n===== TEST 3: seller findAll =====");
		sellList = sellerDao.findAll();
		for(Seller sl : sellList) {
			System.out.println(sl);
		}
		
		System.out.println("\n===== TEST 3: seller findAll =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 
				4000.00, new Department(2, null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	}

}
