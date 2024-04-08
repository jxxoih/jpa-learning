package com.learning.fras.repository;

import com.learning.fras.entity.Member;
import com.learning.fras.entity.Project;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TestRepository {

    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public List<Member> findMember() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    public List<Project> findProject() {
        return em.createQuery("select p from Project p", Project.class)
                .getResultList();
    }
}
