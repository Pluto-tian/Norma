package com.pluto.pluto_springboot.dao;

import com.pluto.pluto_springboot.pojo.Department;
import com.pluto.pluto_springboot.pojo.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Hoaer
 * @version 1.0
 */
@Repository
public class EmployeesDao {
    private static Map<Integer, Employees> employeesMap = null;
    @Autowired
    private DepartmentDao departmentDao;
    static {

        employeesMap = new HashMap<>();
        employeesMap.put(1001,
                new Employees(1001, "伊泽瑞尔", "23917@qq.com", 1,
                        new Department(101, "研发部"),
                        new Date()));
        employeesMap.put(1002,
                new Employees(1002, "崔斯特", "23917@qq.com", 1,
                        new Department(104, "售后部"),
                        new Date()));
        employeesMap.put(1003,
                new Employees(1003, "娑娜", "23917@qq.com", 0,
                        new Department(103, "销售部"),
                        new Date()));
        employeesMap.put(1004,
                new Employees(1004, "奥莉安娜", "23917@qq.com", 0,
                        new Department(103, "销售部"),
                        new Date()));
        employeesMap.put(1005,
                new Employees(1005, "嘉文四世", "23917@qq.com", 1,
                        new Department(102, "生产部"),
                        new Date()));
        employeesMap.put(1006,
                new Employees(1006, "泰达米尔", "23917@qq.com", 1,
                        new Department(105, "市场部"),
                        new Date()));
        employeesMap.put(1007,
                new Employees(1007, "阿卡丽", "23917@qq.com", 0,
                        new Department(101, "研发部"),
                        new Date()));
    }

    /**
     * Add a new employee
     */
    public void add_emloyee(Employees employees) {
        employeesMap.put(employees.getId(), employees);
    }

    /**
     * Query employee information by id
     */
    public Employees getEmloyee(Integer id) {
        return employeesMap.get(id);
    }

    /**
     * delete employee information by id
     */
    private void delete(Integer id) {
        employeesMap.remove(id);
    }
}
