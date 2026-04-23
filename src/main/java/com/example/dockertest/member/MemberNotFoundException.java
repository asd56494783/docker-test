package com.example.dockertest.member;

public class MemberNotFoundException extends RuntimeException {

    public MemberNotFoundException(Long id) {
        super("Member not found: " + id);
    }
}
