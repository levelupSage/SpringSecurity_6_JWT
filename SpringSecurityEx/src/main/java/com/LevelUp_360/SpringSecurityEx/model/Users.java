package com.LevelUp_360.SpringSecurityEx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Users", schema = "spring-security")
public class Users {

    @Id
    private int id;

    private String username;

    private String password;
}

