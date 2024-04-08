package com.learning.fras.service;

import com.learning.fras.entity.Member;
import com.learning.fras.entity.Project;
import com.learning.fras.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TestService {
    private final TestRepository repository;

    @Autowired
    public TestService(TestRepository repository) {
        this.repository = repository;
    }


    public List<Member> findMember() {
        return repository.findMember();
    }

    public List<Project> findProject() {
        return repository.findProject();
    }


    @Transactional
    public void save(Member member) {
        repository.save(member);
    }

}
