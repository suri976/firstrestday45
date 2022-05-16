package com.jobiak.empapi.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/catalog")

public class Product {

	@GetMapping("/mobile")
	public String showCatalog()
	{
		return new String ("Samsung Dual Camera,128 gb rom, 8gb ram,108 Mega Pixel,SnapDragon 865 processor");
	}
	
	
	@GetMapping("/bike")
	public String showCatalog1()
	{
		return new String ("Apache rtr Yellow");
	}
	
	@GetMapping("/search/{modelId}")
	public String serachModel(@PathVariable(value="modelId")String modelId)
	{
		return new String (modelId+"is available only in  Yellow");
	}
	
	@GetMapping("/search/{modelId}/brand/{brand}")
	public String serachModel(@PathVariable(value="modelId")String modelId,@PathVariable(value="brand")String brand)
	{
		return new String (modelId+brand+"samsung s10");
	}
	
	
	
	
	
}
