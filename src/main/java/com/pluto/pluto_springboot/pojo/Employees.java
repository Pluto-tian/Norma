package com.pluto.pluto_springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author Hoaer
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {
    private Integer id;
    private String name;
    private String email;
    private Integer gender; //0:女 1:男
    private Department department;
    //入职日期
    private Date date_of_entry;
}
