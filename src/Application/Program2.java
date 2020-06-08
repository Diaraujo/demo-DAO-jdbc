package Application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== Test 1 findById ====");
		Department dep = departmentDao.findById(4);
		System.out.println("Departamento encontrado!" + dep);
		
		System.out.println("\n=== Test 2 findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj: list) {
		System.out.println(obj);
		}
		
		//System.out.println("\n=== Test 4 INSERT ====");
		//Department department = new Department(null, "Music");
		//departmentDao.insert(department);
		//System.out.println("Novo Departamento incluso: " + department.getId());
		
	}

}
