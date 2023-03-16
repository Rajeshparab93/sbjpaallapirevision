package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue

    private long empId;
    @NotNull
    @Size(min = 2, message = "Min 2 char req")
    private String empFirstName;
    @NotNull
    private String empLastName;
    @Range(min = 1000000000, max = 9999999999L, message = "Min 10 degit number req")
    private long empContactNumber;
    private int empAge;
    private double empSalary;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;
    @Email(message = "Enter valid emailid only")
    private String empEmailId;
    @Size(min = 2, message = "Min 2 char req")
    private String empPassword;
}
