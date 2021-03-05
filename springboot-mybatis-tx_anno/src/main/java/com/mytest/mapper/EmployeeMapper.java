package com.mytest.mapper;

import com.mytest.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/22
 */
//@Mapper : 表示本类是一个 MyBatis 的 Mapper
@Mapper
@Repository
@SuppressWarnings("all")
public interface EmployeeMapper {

    // 获取所有员工信息
    List<Employee> getEmployees();

    // 新增一个员工
    int save(Employee employee);

    // 通过id获得员工信息
    Employee get(Integer id);

    // 通过id删除员工
    int delete(Integer id);

}