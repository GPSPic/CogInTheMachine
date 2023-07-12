package com.cogs.CogInTheMachine.components;

import com.cogs.CogInTheMachine.models.enums.AccessEnum;
import com.cogs.CogInTheMachine.models.enums.DepartmentEnum;
import com.cogs.CogInTheMachine.models.staff.Employee;
import com.cogs.CogInTheMachine.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.GregorianCalendar;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception {
        LocalDate bobDob = LocalDate.of(1990, 07, 3);
        LocalDate bobStartDate = LocalDate.of(2020, 07, 3);
        Employee droneTest =  new Employee(
                "Bob",
                "Bobberson",
                bobDob,
                bobStartDate,
                AccessEnum.USER,
                20000,
                DepartmentEnum.FACILITIES,
                "https://cdn4.vectorstock.com/i/1000x1000/45/68/male-janitor-with-water-bucket-and-broom-vector-18014568.jpg",
                true,
                "07711223349",
                "bob.bobberson@coginthemachine.com",
                "JW123456"
                );
    }
}
