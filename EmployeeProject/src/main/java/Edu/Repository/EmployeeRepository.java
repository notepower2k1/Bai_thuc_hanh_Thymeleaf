package Edu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Edu.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
