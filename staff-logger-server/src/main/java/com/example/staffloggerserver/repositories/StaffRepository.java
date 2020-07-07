package com.example.staffloggerserver.repositories;

import com.example.staffloggerserver.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
