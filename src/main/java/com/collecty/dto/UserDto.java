package com.collecty.dto;

import com.collecty.entity.Phone;

import java.util.Date;

public class UserDto {

    String email;
    String name;
    String username;
    String password;
    Date birthDate;
    Phone cellPhone;
    char gender;
    String role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Phone getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Phone cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
