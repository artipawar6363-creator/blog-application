package com.blog.controllers;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.dao.PostRepository;
import com.blog.dao.UserRepository;
import com.blog.entities.Blogpost;
import com.blog.entities.User;
@Controller
public class UserController {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;

		@RequestMapping("/home")
		public String home(Model model) {
			model.addAttribute("title","blog-application");
			return "home";
		}
		@RequestMapping("/signin")
		public String signin(Model model)
		{
			model.addAttribute("title","blog-application");
			model.addAttribute("user",new User());
		return "signin";	
		}
		@RequestMapping("/login")
		public String login(Model model)
		{
			model.addAttribute("title","blog-application");
		return "login";	
		}
		
		@PostMapping("/do_register") 
			public String registerUser(@ModelAttribute("user") User user)
			{
				System.out.println("User" + user);
				User result = this.userRepository.save(user);
				return "signin";
			}
		@RequestMapping("/view") 
		public String viewpage ()
		{
			return "view";
			
		}
		@RequestMapping("/createblog")
		public String createblog () {
			return "createblog";
		}
		
		@PostMapping("/create_content") 
		public String contentcreate(@ModelAttribute("blogpost") Blogpost blogpost) {
		    System.out.println("Blogpost" + blogpost);
		    Blogpost cresult = this.postRepository.save(blogpost);
		    return "createblog";
		}
}



