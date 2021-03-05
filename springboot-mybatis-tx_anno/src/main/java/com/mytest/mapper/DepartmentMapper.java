package com.mytest.mapper;

import com.mytest.model.Department;
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
public interface DepartmentMapper {

    // 获取所有部门信息
    List<Department> getDepartments();

    // 通过id获得部门
    Department getDepartment(Integer id);

}
