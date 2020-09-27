package com.lealpha.learningwhilesleeping.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;
    private String province;
    private String city;
    private String street;
    private String zip;
    private String num;
    private String unit;
    @Column(name = "fk_tbl_user_id")
    private int fkTblUserId;

}
