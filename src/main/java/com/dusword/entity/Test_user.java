package com.dusword.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Test_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer USER_ID ;
    private String USER_NAME;
    private String USER_PASSWORD;

}
