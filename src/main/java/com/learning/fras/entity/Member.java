package com.learning.fras.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    private int m_id;
    private String m_name;

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }
}
