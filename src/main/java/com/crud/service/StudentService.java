package com.crud.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.StudentMapper;
import com.crud.pojo.Student;

@Service
public class StudentService implements IService{

	@Autowired
	private StudentMapper studentMapper;

	
	public List<Student> findStudent() {
		return studentMapper.findStudent();
	}
	public List<Student> findStudentByPage(int startPage,int pageSize) {
		Map<String, Object> data = new HashMap<String, Object>();
	    data.put("currIndex", (startPage-1)*pageSize);
	    data.put("pageSize", pageSize);
	    return studentMapper.findStudentByPage(data);
	}
	public Student findStudentById(int sid) {
		return studentMapper.findStudentById(sid);
	}
	
	public int insertStudent (Student student) {
		return studentMapper.insertStudent(student);
	}
	public int updateStudent(Student student) {
		return studentMapper.updateStudent(student);
	}
	public int deleteStudent(int sid) {
		return studentMapper.deleteStudent(sid);
	}
}

