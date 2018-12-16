package com.imooc.course.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.imooc.course.service.ICourseService;
import com.imooc.course.service.dto.CourseDTO;
import com.imooc.thrift.user.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Reference
    private ICourseService courseService;

    @GetMapping("/courseList")
    @ResponseBody
    public List<CourseDTO> courseList(HttpServletRequest request) {
        UserDTO user = (UserDTO) request.getAttribute("user");
        System.out.println(user);
        return courseService.courseList();
    }
}
