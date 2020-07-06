package com.example.staffloggerserver.dtos;

import javax.persistence.Column;
import java.sql.Date;

public class EmployeeDto {
    @Column
    private String name;

    @Column
    private String department;

    @Column
    private Date dob;

    @Column
    private String gender;
}
