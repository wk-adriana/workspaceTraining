package com.endava.jpa.dao.impl;

import com.endava.jpa.dao.ProjectDao;
import com.endava.jpa.model.Department;
import com.endava.jpa.model.Project;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProjectDaoImpl implements ProjectDao {

	@PersistenceContext
	private EntityManager entityManager;

	private final String QUERY_FIND_ALL = "SELECT p FROM Project p";

	public Project find(int id) {
		return entityManager.find(Project.class, id);
	}

	public List<Project> findAll() {
		return entityManager.createQuery(QUERY_FIND_ALL)
				.getResultList();
	}

	public void save(Project toBeSaved) {
		entityManager.persist(toBeSaved);
	}

	public void update(Project toBeUpdated) {
		entityManager.merge(toBeUpdated);
	}

	public void remove(Project toBeRemoved) {
		Project project = entityManager.find(Project.class, toBeRemoved.getId());
		entityManager.merge(project);
		entityManager.remove(project);
	}
}
