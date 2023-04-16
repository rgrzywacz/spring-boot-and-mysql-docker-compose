package com.grzywacz.springbootandmysqldockercompose.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    protected String name;

    public UserDto(String name) {
        this.name = name;
    }
}
