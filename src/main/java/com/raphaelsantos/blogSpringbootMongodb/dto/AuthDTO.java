package com.raphaelsantos.blogSpringbootMongodb.dto;

import com.raphaelsantos.blogSpringbootMongodb.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthDTO {
    private String id;
    private String name;

    public AuthDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }
}
