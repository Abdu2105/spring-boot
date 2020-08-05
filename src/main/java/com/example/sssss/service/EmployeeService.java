package com.example.sssss.service;

import com.example.sssss.domain.Employee;
import com.example.sssss.repository.EmployeeRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee findById(Long id){
        return employeeRepository.findById(id).get();
    }

    public List<Employee> findByName(String name){
        return employeeRepository.findByName(name);
    }

    public List<Employee> findAllByParam(String name){
        return employeeRepository.findAllByLike(name);
    }

    public void delete(Long id){
        Employee employee = employeeRepository.getOne(id);
        employeeRepository.delete(employee);
    }

    @Scheduled(cron = "00 57 10 * * * ")
    public Employee saveSchedule(){
        Employee employee1 = new Employee();
        employee1.setName("lalaldcfdw");
        employee1.setLastName("alla");
        return employeeRepository.save(employee1);
    }
}
