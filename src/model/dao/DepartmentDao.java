package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void insert(Integer obj);
	Department findById(Department obj);
	List<Department> findAll();

}
