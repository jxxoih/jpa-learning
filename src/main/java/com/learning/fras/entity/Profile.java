package com.learning.fras.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    private int p_idx;
    private String p_name;
    private String p_contact;
    private String p_auth_pwd;
    private String p_github;
    private String p_email;
    private int p_birth;
    private String p_description;
    private String p_about_title;
    private String p_about_context;
}
