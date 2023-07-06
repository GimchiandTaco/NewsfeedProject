package com.sparta.newsfeedproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private String username;
    private String password;
    private String name;
    private String email;
    private String introduce;
}
