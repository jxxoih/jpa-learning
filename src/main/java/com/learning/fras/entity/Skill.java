package com.learning.fras.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    private int s_idx;
    private String s_name;
    private String s_img;
    private int sf_idx;
}
