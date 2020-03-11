package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = null;
		
		System.out.println("\n===== Teste department insert =====");
		departmentDao.insert(new Department(null, "Teste"));
		
		System.out.println("\n===== Teste department update =====");
		departmentDao.update(new Department(8, "Consegui"));
		
		System.out.println("\n===== Teste department delete =====");
		departmentDao.deleteById(7);
		
		System.out.println("\n===== Teste department findById =====");
		dep = departmentDao.findById(6);
		System.out.println(dep);
		

		System.out.println("\n===== Teste department findAll =====");
		List<Department> listDep = departmentDao.findAll();
		for (Department dp : listDep) {
			System.out.println(dp);
		}
		 
	}

}
