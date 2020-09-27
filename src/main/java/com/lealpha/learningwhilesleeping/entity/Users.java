package com.lealpha.learningwhilesleeping.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_users")
public class Users {
    @Id
    @Column(name = "user_id")
    private int userId;
    @Column(name = "f_name")
    private String firstName;
    @Column(name = "l_name")
    private String lastName;
    private String mobile;
    @Column(name = "national_id")
    private String nationalId;
    private String email;
    @Column(name = "created_date")
    private Date createdDate;
    private enum gender{male, female};
    @Column(name = "education_name")
    private String educationName;
    @Column(name = "job_name")
    private String jobName;
    private enum status{active, suspend, deactive};
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
}
