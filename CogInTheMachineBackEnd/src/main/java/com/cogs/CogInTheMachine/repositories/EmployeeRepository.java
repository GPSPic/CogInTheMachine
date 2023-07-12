package com.cogs.CogInTheMachine.repositories;

import com.cogs.CogInTheMachine.models.staff.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
