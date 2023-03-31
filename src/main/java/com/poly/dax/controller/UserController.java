package com.poly.dax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poly.dax.model.User;
import com.poly.dax.repository.ProjectRepository;
import com.poly.dax.repository.UserRepository;
import com.poly.dax.service.ProjectService;
import com.poly.dax.serviceimpl.UserServiceImpl;


@Controller
public class UserController {
	@Autowired
	ProjectService projectService;
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@GetMapping("/index")
	public String getAdmin(Model model) {
		return "redirect:/admin/html/index.html";
	}
	@GetMapping("/user")
	public String index(Model model) {
		
//		model.addAttribute("ls", projectService.getAll());
//		model.addAttribute("ls", projectRepository.findAll());
		model.addAttribute("ls", userRepository.findAll());
		return "index";
	}
	@GetMapping("/all")
	  public @ResponseBody Iterable<User> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return userRepository.findAll();
	  }
	@RequestMapping("home")
	public String home(Model model) {
		model.addAttribute("hello", "hello");
		return "index";
	}
}
