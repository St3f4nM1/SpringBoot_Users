package com.example.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @Id
    private int id;
    private String socialNumber;
    private String fullName;
    private String dateOfBirth;
    private int mobileNumber;
}
