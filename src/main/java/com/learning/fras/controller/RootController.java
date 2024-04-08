package com.learning.fras.controller;

import com.learning.fras.entity.Member;
import com.learning.fras.entity.Project;
import com.learning.fras.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RootController {

    private final TestService service;

    @Autowired
    public RootController(TestService service) {
        this.service = service;
    }

    @GetMapping("/test")
    public String getTest() {
        return "hello world";
    }

    @GetMapping("/selectMember")
    public List<Member> selectMember() {
        List<Member> memberResult = service.findMember();

        return memberResult;
    }

    @GetMapping("/selectProject")
    public List<Project> selectProject() {
        List<Project> project = service.findProject();

        return project;
    }

}
