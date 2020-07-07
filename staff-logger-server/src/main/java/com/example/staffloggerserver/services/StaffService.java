package com.example.staffloggerserver.services;

import com.example.staffloggerserver.models.Staff;
import com.example.staffloggerserver.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public Staff save(Staff staff){
        return staffRepository.save(staff);
    }

    public List<Staff> get(){
        return staffRepository.findAll();
    }

    public Staff get(Integer id) throws Exception {
        return staffRepository.findById(id).orElseThrow(() -> new Exception("Employee not found"));
    }

    public void delete(Integer id){
        staffRepository.deleteById(id);
    }
}
