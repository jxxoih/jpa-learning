package com.learning.fras.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    private int c_idx;
    private int p_idx;
    private String company_nm;
    private int emp_status;
    private Date w_start_date;
    private Date w_end_date;
    private int use_status;
    private Timestamp updated_at;
    private Timestamp created_at;



}
