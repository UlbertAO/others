package com.vyntra.vyntrau.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vyntra.vyntrau.dao.productsrepo;
import com.vyntra.vyntrau.dao.vyntrarepo;
import com.vyntra.vyntrau.model.Vyntrauser;
import com.vyntra.vyntrau.model.products;





@Controller
public class Vyntrausercontroller {
	
	@GetMapping
	public String landToIndex(Model model)
	{
		model.addAttribute("Vyntrauser", new Vyntrauser());
		return "reg.jsp";
	}
	/*@PostMapping
	public ModelAndView saveUpdateUser(@ModelAttribute @Validated Vyntrauser v,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			model.addAttribute("vyntrauser", v);
			ModelAndView mv=new ModelAndView("reg.jsp");
			return mv;
		}
		else
		{
			userLoginService.saveUser(v);
			return new ModelAndView("redirect:/home.jsp");
		}
		
	}
	@GetMapping("/update/{id}")
	public ModelAndView fetchingUser(@ModelAttribute Vyntrauser v,Model model)
	{
		model.addAttribute("vyntrauser", userLoginService.fetchingUserDetailThroughId(v));
		return new ModelAndView("reg.jsp");
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteUser(@ModelAttribute Vyntrauser v,Model model)
	{
		userLoginService.deletingUser(v);
		return new ModelAndView("redirect:/home.jsp");
	}*/

	@Autowired
	vyntrarepo u;
	@Autowired
	productsrepo p;
	@GetMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	
	@GetMapping("/vyntra")
	public String vyntra()
	{
		return "Vyntra.jsp";
	}
	
	@GetMapping("/reg")
	public ModelAndView register()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("reg.jsp");
		return mv;
	}
	
	@PostMapping("/reg")
	@ResponseBody
	public String register(Vyntrauser s)
	{
		u.save(s);
		return "Successfully Registered";
	}
	@RequestMapping("/login")
	public ModelAndView login(String uname,String password)
	{
		ModelAndView mv=new ModelAndView("login.jsp");
		
		return mv;
	}
	
	@PostMapping("/addpro")
	public ModelAndView addpro(@RequestBody products k)
	{
		p.save(k);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Addproducts.jsp");
		return mv;
	}
	

	
	
	@GetMapping("/addpro")
	public ModelAndView addpro()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Addproducts.jsp");
		return mv;
	}
	
	@GetMapping("/listpro")
	public ModelAndView listpro()
	{
		ModelAndView mv=new ModelAndView();
		List<products> l=new ArrayList<>();
		for(products d:p.findAll())
		{
			l.add(d);
			System.out.println(d);
		}
		System.out.print(l);
		mv.addObject(l);
		mv.setViewName("Listproducts.jsp");
		return mv;
	}
}