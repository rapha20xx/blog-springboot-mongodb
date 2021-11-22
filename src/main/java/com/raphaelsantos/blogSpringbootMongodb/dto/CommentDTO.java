package com.raphaelsantos.blogSpringbootMongodb.dto;

import com.raphaelsantos.blogSpringbootMongodb.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CommentDTO implements Serializable {
    private String text;
    private Date date;
    private AuthDTO authDTO;

    private List <CommentDTO> commentDTOS = new ArrayList<>();

    public CommentDTO(String text, Date date, AuthDTO authDTO) {
        super();
        this.text = text;
        this.date = date;
        this.authDTO = authDTO;
    }
}
