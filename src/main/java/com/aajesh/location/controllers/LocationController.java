package com.aajesh.location.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aajesh.location.entities.Location;
import com.aajesh.location.service.LocationService;
import com.aajesh.location.util.EmailUtil;

@Controller
public class LocationController {

	@Autowired	
	LocationService service;
	
	@Autowired
	EmailUtil emailUtil;
	
	/*first page the show the application load*/
	@RequestMapping("/showCreate")
	public String showCreate() {
		System.out.println("show create ");
		return "createLocation";
	}
	
	/*
	 * save the in insert data in database 
	 * 
	 * */
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap ) {
		Location locationSaved=service.saveLocation(location);
		String msg="Location Saved With id: "+locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		emailUtil.sendMail("ajay.compind@gmail.com","Location saved", "Location Saved Successfully and about to return");
	    return "createLocation";
		
	}
	/*
	 * show the all data in database 
	 * 
	 * */
	@RequestMapping("/displaylocations")
	public String displayLocation(ModelMap modelMap ) {
		List<Location> lLocations =service.getAllLocations();
		modelMap.addAttribute("locations", lLocations);
		return "displayLocations";  //display the jsp page
		
	}
	
	
	/*
	 * delete the data in base on Id
	 * 
	 * */
	@RequestMapping("/deleteLocations")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap ) {
	   // Location locationbyid=service.getLocationById(id);
	    Location location =new Location();
	    location.setId(id);
		service.deleteLocation(location);
		List<Location>locations=service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
		
	}
	
	
	/*
	 * delete the data in base on Id
	 * 
	 * */
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap ) {
	  System.out.println("Hello update the ");
		Optional<Location> locationbyid=service.getLocationById(id);
		
		  System.out.println("Hello update the ");
	   Location locations=locationbyid.get();
	   
	   System.out.println("Hello update the "+locations);
	   
	   // Location location =new Location();
	    //location.setId(id);
		//service.deleteLocation(location);
		// List<Location>locations=service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		System.out.println("Hello update the ");
		return "updateLocation";// this jsp page 
		
	}
	
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap ) {
		System.out.println("===================1============================");
		service.updateLocation(location);
		List<Location>locations=service.getAllLocations();
		modelMap.addAttribute("locations", locations);
 
		return "displayLocations";
		
	}
	
	
	
	
	
}
