package ru.courseworkdt.elib.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table (name = "usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private boolean active;


    public User() {}

    public User(Long id)  {
        this.Id = id;
    }

    public User(String username, String password, String email, String phone, boolean active) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
