package com.employee.employee.shared;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
