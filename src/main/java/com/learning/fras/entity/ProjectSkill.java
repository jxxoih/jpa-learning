package com.learning.fras.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "project_skill")
@Getter
@Setter
public class ProjectSkill {
    @Id
    @Column(name = "ps_idx")
    private int id;

    private int p_idx;
    private int pro_idx;
    private int s_idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName="pro_idx")
    private Project project;

}
