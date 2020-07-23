package com.spring.oracle.DAO;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.oracle.model.Employee;


@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {

 List<Employee> findByDeptName(String deptName);
}