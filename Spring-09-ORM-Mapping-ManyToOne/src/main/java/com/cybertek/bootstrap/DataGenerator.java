package com.cybertek.bootstrap;

import com.cybertek.entity.Department;
import com.cybertek.entity.Employee;
import com.cybertek.entity.Region;
import com.cybertek.enums.Gender;
import com.cybertek.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;
    //DepartmentRepository departmentRepository;

//    @Autowired
//    public DataGenerator(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
//        this.employeeRepository = employeeRepository;
//        this.departmentRepository = departmentRepository;
//    }

    @Override
    public void run(String... args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        List<Department> regionList = new ArrayList<>();


        Employee e1 = new Employee("Berrie1", "Manueau1", "bmanueau0@dion.ne.jp1", LocalDate.of(2001, 01, 26), Gender.M, 154864);
        Employee e2 = new Employee("Berrie2", "Manueau2", "bmanueau0@dion.ne.jp2", LocalDate.of(2002, 01, 26), Gender.M, 254864);
        Employee e3 = new Employee("Berrie3", "Manueau3", "bmanueau0@dion.ne.jp3", LocalDate.of(2003, 01, 26), Gender.M, 354864);
        Employee e4 = new Employee("Berrie4", "Manueau4", null, LocalDate.of(2004, 01, 26), Gender.F, 454864);
        Employee e5 = new Employee("Berrie5", "Manueau5", "bmanueau0@dion.ne.jp5", LocalDate.of(2005, 01, 26), Gender.F, 554864);


        Department d1 = new Department("Sports", "Outdoors");
        Department d2 = new Department("Tools", "Hardware");
        Department d3 = new Department("Clothing", "Home");
        Department d4 = new Department("Phone & Tablets", "Electronics");
        Department d5 = new Department("Computers", "Electronics");

        Region r1 = new Region("Southwest", "United States");
        Region r2 = new Region("Central", "United States");
        Region r3 = new Region("Northwest", "United States");
        Region r4 = new Region("Quebec", "Canada");
        Region r5 = new Region("Central", "Asia");


        e1.setDepartment(d1);
        e2.setDepartment(d1);
        e3.setDepartment(d1);
        e4.setDepartment(d4);
        e5.setDepartment(d5);

        e1.setRegion(r1);
        e2.setRegion(r2);
        e3.setRegion(r3);
        e4.setRegion(r4);
        e5.setRegion(r5);


        employeeList.addAll(Arrays.asList(e1, e2, e3, e4, e5));
        //departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));

        employeeRepository.saveAll(employeeList);
        //departmentRepository.saveAll(departmentList);

        employeeRepository.deleteById(1);

    }
}
