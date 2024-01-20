package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.packs;
import com.demo.service.packsService;

@Controller
@RequestMapping("/packs")
public class packsController {
	
	@Autowired
	packsService eservice;
	
	@GetMapping("/getpacks")
	public ModelAndView getemployees()
	{
		
			List<packs> elist=eservice.getAllpacks();
			return new ModelAndView("displaypacks","elist",elist);	
	}
	
	@GetMapping("/addpacks")
	public String addpacks()
	{
		return "addpacks";
	}
	
	@PostMapping("/insertpacks")
	public ModelAndView insertemployee(@RequestParam String custno,@RequestParam String basepack,@RequestParam String optionalpack)
	{
		packs e=new packs(custno,basepack,optionalpack);
		eservice.addnewpacks(e);
		return new ModelAndView("redirect:/packs/getpacks");
	}
//	
//	@GetMapping("/edit/{id}")
//	public ModelAndView editemployee(@PathVariable("id") int id) {
//		Employee e=eservice.getById(id);
//		return new ModelAndView("editemployee","e",e);
//		
//	}
//	
//	@PostMapping("/updateemployee")
//	public ModelAndView updateemployee(@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam double salary){
//		eservice.updateById(new Employee(id,name,email,salary));
//		return new ModelAndView("redirect:/employee/getemployees");
//	}
//	
//	@GetMapping("delete/{id}")
//	public ModelAndView deleteemployee(@PathVariable int id) {
//		eservice.deleteById(id);
//		return new ModelAndView("redirect:/employee/getemployees");
//	}
	
	
	

}
