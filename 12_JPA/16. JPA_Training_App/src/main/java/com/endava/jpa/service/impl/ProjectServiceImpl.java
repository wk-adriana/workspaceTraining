package com.endava.jpa.service.impl;

import com.endava.jpa.dao.ProjectDao;
import com.endava.jpa.model.Project;
import com.endava.jpa.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectDao projectDao;

    public Project find(String name) {
        return projectDao.find(name);
    }

}
