package com.learning.fras.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Table(name = "company")
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Slf4j
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int c_idx;

    @Column(name = "p_idx")
    private int p_idx;

    @Column(name = "company_nm")
    private String company_nm;

    @Column(name = "emp_status")
    private int emp_status;

    @Column(name = "w_start_date")
    private Date w_start_date;

    @Column(name = "w_end_date")
    private Date w_end_date;

    @Column(name = "use_status")
    private int use_status;

    @Column(name = "updated_at")
    private Timestamp updated_at;

    @Column(name = "created_at")
    private Timestamp created_at;

}
