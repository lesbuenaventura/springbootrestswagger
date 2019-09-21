package net.guides.springboot2.springboot2swagger2.repository;

import net.guides.springboot2.springboot2swagger2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}