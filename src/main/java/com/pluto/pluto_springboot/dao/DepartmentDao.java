package com.pluto.pluto_springboot.dao;

import com.pluto.pluto_springboot.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Hoaer
 * @version 1.0
 */
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departmentMap = null;
    static {
        departmentMap = new HashMap<Integer,Department>();
        departmentMap.put(101,new Department(101,"研发部"));
        departmentMap.put(102,new Department(102,"生产部"));
        departmentMap.put(103,new Department(103,"销售部"));
        departmentMap.put(104,new Department(104,"售后部"));
        departmentMap.put(105,new Department(105,"市场部"));
    }

    /**
     * All Department information
     */

    public Collection<Department> getDepartmets(){
        return departmentMap.values();
    }

    /**
     * Query department information by id
     */

    public Department getDepartment(Integer id){
        return departmentMap.get(id);
    }
}
