package com.amit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employeetable")
public class Employee {

    @Id
    @Column(name = "id")
    private Integer empId;
    @Column(name = "name")
    private String empName;
    @Column(name = "salary")
    private Double empSal;

}
