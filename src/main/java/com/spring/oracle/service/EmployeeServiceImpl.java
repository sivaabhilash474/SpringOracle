package com.spring.oracle.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.oracle.DAO.IEmployeeDAO;
import com.spring.oracle.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
 @Autowired
 private IEmployeeDAO daoRef;
 
 @Override
 public List<Employee> getAllEmployee() {
  return daoRef.findAll();
 }
 @Override
 public Employee getEmployeeById(int empId) {
  return daoRef.getOne(empId);
 }
 @Override
 public void addEmployee(Employee employee) {
 }

 @Override
 public void updateEmployee(Employee employee, int empId) {
  daoRef.save(employee);
 }

 @Override
 public void deleteEmployee(int empId) {
  daoRef.deleteById(empId);
 }
 @Override
 public List<Employee> getEmployeeByDept(String deptName) {
  return daoRef.findByDeptName(deptName);
 }
}