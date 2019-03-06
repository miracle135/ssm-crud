package com.crud.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.crud.pojo.Student;

@Repository
public interface StudentMapper {

	//��ѯ����
	public List<Student> findStudent();
	
	//��ѯ����
	public Student findStudentById(int sid);
	
	//��ҳ
	public List<Student> findStudentByPage(Map<String,Object> data);
	
	//����ѧ��
	public int insertStudent(Student student);

	//ɾ��ѧ��
	public int deleteStudent(int sid);
	
	//����ѧ����Ϣ
	public int updateStudent(Student student);
	
}
