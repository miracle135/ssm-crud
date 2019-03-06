package com.crud.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.crud.pojo.Student;

@Repository
public interface StudentMapper {

	//查询所有
	public List<Student> findStudent();
	
	//查询单个
	public Student findStudentById(int sid);
	
	//分页
	public List<Student> findStudentByPage(Map<String,Object> data);
	
	//增加学生
	public int insertStudent(Student student);

	//删除学生
	public int deleteStudent(int sid);
	
	//更新学生信息
	public int updateStudent(Student student);
	
}
