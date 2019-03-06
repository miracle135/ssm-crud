package com.crud.controller;

import java.util.List;

import javax.print.DocFlavor.READER;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.crud.pojo.Student;
import com.crud.service.StudentService;


@Controller
@RequestMapping(value="student",produces="text/html;charset=UTF-8")
public class StudentController {

	@Autowired
	private StudentService studentService;
	private int result;
	//分页
	@RequestMapping("findStudentByPage/{page}")
	public String findStudentByPage(@PathVariable("page") int page,HttpSession session,HttpServletRequest request) {
		List<Student> listAll = studentService.findStudent();
		int pageNums = (listAll.size()-1)/2+1;
		session.setAttribute("pageNums", pageNums);
		List<Student> list = studentService.findStudentByPage(page,2);
		request.setAttribute("list", list);
		return "main";
		
	}
	
	//删除
	@RequestMapping("deleteStudentById/{sid}")
	public String deleteStudentById(@PathVariable("sid") int sid) {
		result = studentService.deleteStudent(sid);
		if(result>0)
			return "main";
		else
			return "false";
	}
	
	//更新跳转页面
	@RequestMapping("updateStudentOne/{sid}")
	public String updateStudentOne(@PathVariable("sid") int sid,HttpServletRequest request) {
		request.setAttribute("sid", sid);
		return "update";
	}
	
	//更新
	@RequestMapping("updateStudentTwo")
	public String updateStudentById(Student student) {
		result = studentService.updateStudent(student);
		if(result>0)
			return "main";
		else
			return "false";
		
	}
	//增加跳转页面
	@RequestMapping("insertStudentOne")
	public String insertStudentOne() {
		
		return "insert";
	}
	
	//增加
	@RequestMapping("insertStudentTwo")
	public String insertStudent(Student student) {
		result = studentService.insertStudent(student);
		if(result>0)
			return "main";
		else
			return "false";
	} 
	@RequestMapping("/hh")
	public String sss() {
		return "main";
		
	}

}
