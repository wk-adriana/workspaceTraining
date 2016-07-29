package com.endava.jpa.dao.impl;

import com.endava.jpa.dao.ProjectDao;
import com.endava.jpa.model.Department;
import com.endava.jpa.model.Project;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static javafx.scene.input.KeyCode.Q;

@Repository
public class ProjectDaoImpl implements ProjectDao {

	private final String QUERY_FIND_BY_NAME = "SELECT p FROM Project p WHERE p.name = :project_name";

	@PersistenceContext
	private EntityManager entityManager;

	public Project find(String name) {
		return (Project) entityManager.createQuery(QUERY_FIND_BY_NAME)
				.setParameter("project_name", name)
				.getSingleResult();
	}
}
