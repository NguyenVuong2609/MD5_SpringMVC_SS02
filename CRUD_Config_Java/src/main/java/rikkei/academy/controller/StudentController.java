package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import rikkei.academy.model.Student;
import rikkei.academy.service.IStudentService;

import java.util.List;

@Controller
@RequestMapping(value = {"/", "/student"})
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping
    public ModelAndView showListStudent() {
        ModelAndView modelAndView = new ModelAndView("student/list");
        List<Student> studentList = studentService.findAll();
        modelAndView.addObject("listStudent", studentList);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detailStudent(@PathVariable Long id) {
        Student student = studentService.findById(id);
        ModelAndView modelAndView = new ModelAndView("student/detail");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @GetMapping("/update/{id}")
    public ModelAndView showFormEdit(@PathVariable Long id) {
        Student student = studentService.findById(id);
        ModelAndView modelAndView = new ModelAndView("student/edit");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping("/update/{id}")
    public String actionEdit(@PathVariable Long id, @RequestParam("name") String name,
                                   @RequestParam("email") String email, @RequestParam("address") String address) {
        Student student = studentService.findById(id);
        student.setName(name);
        student.setEmail(email);
        student.setAddress(address);
        studentService.save(student);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String actionDelete(@PathVariable Long id){
        studentService.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("/create")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("student/create");
        return modelAndView;
    }
    @PostMapping("/create")
    public String actionCreate(@RequestParam("name") String name,
                               @RequestParam("email") String email, @RequestParam("address") String address){
        Long id;
        List<Student> studentList = studentService.findAll();
        if (studentList.size() == 0){
            id = 1L;
        } else {
            id = (studentList.get(studentList.size() - 1).getId()) + 1L;
        }
        studentService.save(new Student(id,name,email,address));
        return "redirect:/";
    }
}
