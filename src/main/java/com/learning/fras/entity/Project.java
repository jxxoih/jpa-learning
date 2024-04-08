package com.learning.fras.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "project")
@Getter
@Setter
public class Project {
    @Id
    @Column(name = "pro_idx")
    private int id;

    private int p_idx;
    private int c_idx;
    private String pro_name;
    private int pro_position;
    private String pro_detail;
    private String pro_url;
    private Date pro_start_date;
    private Date pro_end_date;
    private int use_status;

    @OneToMany(mappedBy = "project")
    private List<ProjectSkill> projectSkills = new ArrayList<>();

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "profile_p_idx")
//    private Profile profile;

}
