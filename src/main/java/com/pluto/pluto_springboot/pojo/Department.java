package com.pluto.pluto_springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author Hoaer
 * @version 1.0
 */
//部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    //部门id
    private Integer id;
    //部门名称
    private String department_name;

}
