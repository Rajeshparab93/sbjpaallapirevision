package com.csi.repository;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public List<Employee> findByEmpFirstName(String empFirstName);

    public List<Employee> findByEmpFirstNameAndEmpLastName(String empFirstName, String empLastName);

    public Employee findByEmpContactNumber(long empContactNumber);

    public Employee findByEmpEmailId(String empEmailId);

    public Employee findByEmpEmailIdAndEmpPassword(String empEmailId, String empPassword);
}
