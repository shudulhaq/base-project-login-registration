package com.example.baseprojectloginregistration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "mst_user_login")
public class RegistrationRequest {

    @Id
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
