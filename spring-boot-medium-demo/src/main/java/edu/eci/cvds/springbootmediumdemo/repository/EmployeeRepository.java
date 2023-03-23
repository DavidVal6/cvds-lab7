package edu.eci.cvds.springbootmediumdemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.eci.cvds.springbootmediumdemo.model.*;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
