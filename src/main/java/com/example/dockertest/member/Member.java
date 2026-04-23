package com.example.dockertest.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    private String name;

    @Column(nullable = false, unique = true, length = 120)
    private String email;

    @Column(nullable = false, length = 20)
    private String level;

    @Column(nullable = false)
    private boolean active;

    protected Member() {
    }

    public Member(String name, String email, String level, boolean active) {
        this.name = name;
        this.email = email;
        this.level = level;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLevel() {
        return level;
    }

    public boolean isActive() {
        return active;
    }
}
