package com.endava.jpa.dao.impl;

import com.endava.jpa.dao.DepartmentDao;
import com.endava.jpa.model.Department;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@PersistenceContext
	private EntityManager entityManager;

	private final String QUERY_FIND_DEPARTMENT_BY_NAME = "SELECT d FROM Department d WHERE d.name = :dep_name";

	public Department find(int id) {
		return entityManager.find(Department.class, id);
	}

	public List<Department> find(String departmentName) {
		return entityManager.createQuery(QUERY_FIND_DEPARTMENT_BY_NAME)
				.setParameter("dep_name", departmentName)
				.getResultList();
	}

	public void save(Department toBeSaved) {
		entityManager.persist(toBeSaved);
	}

	public void update(Department toBeUpdated) {
		entityManager.merge(toBeUpdated);
	}

	public void remove(Department toBeRemoved) {
		entityManager.merge(toBeRemoved);
		entityManager.remove(toBeRemoved);
	}
}
