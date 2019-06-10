package org.noreebia.graphqltutorial.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.noreebia.graphqltutorial.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeResolver implements GraphQLQueryResolver {
    public List<Employee> employees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "010-7720-9384"));
        return employees;
    }
}
