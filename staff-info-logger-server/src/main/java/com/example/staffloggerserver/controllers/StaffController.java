package com.example.staffloggerserver.controllers;

import java.util.List;

import com.example.staffloggerserver.models.Staff;
import com.example.staffloggerserver.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/staff")
@CrossOrigin
public class StaffController {
	
	@Autowired
	private StaffService staffService;

	@RequestMapping(path = "", method = RequestMethod.POST)
	public Staff save(@RequestBody Staff staff) {
		staffService.save(staff);
		return staff;
	}
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<Staff> get() {
		return staffService.get();
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Staff get(@PathVariable int id) {
		return staffService.get().get(id);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	public Staff update(@RequestBody Staff staff) {
		staffService.save(staff);
		return staff;
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable int id) {
		staffService.delete(id);
		return "Staff removed with id "+id;
		
	}

} 
