package com.example.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "social_number")
    private String socialNumber;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "dob")
    private String dateOfBirth;
    @Column(name = "mobile_number")
    private int mobileNumber;
}
