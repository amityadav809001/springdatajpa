package com.amit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyTestRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public void run(String... args) throws Exception
    {
      System.out.println("Class Name"+" "+repo.getClass().getName());

      repo.save(new Employee(120,"anjali",39996.0));
    }
}
