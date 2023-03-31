package com.poly.dax.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.dax.model.Project;
import com.poly.dax.repository.ProjectRepository;
import com.poly.dax.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	ProjectRepository projectRepository;
	@Override
	public List<Project> getAllProject() {
		return (List<Project>) projectRepository.findAll();
	}
	
}
