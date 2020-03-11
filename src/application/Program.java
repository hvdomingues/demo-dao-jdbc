package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("===== TEST 2: seller findByDepartment =====");
		List<Seller> sellList = sellerDao.findByDepartmentId(2);
		for(Seller sl : sellList) {
			System.out.println(sl);
		}
		
		System.out.println("===== TEST 3: seller findAll =====");
		sellList = sellerDao.findAll();
		for(Seller sl : sellList) {
			System.out.println(sl);
		}
	}

}
