package com.raphaelsantos.blogSpringbootMongodb.domain;

import com.raphaelsantos.blogSpringbootMongodb.dto.AuthDTO;
import com.raphaelsantos.blogSpringbootMongodb.dto.CommentDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Post implements Serializable{

    @Id
    private String id;

    private Date date;
    private String title;
    private String body;
    private AuthDTO author;

    private List<CommentDTO> commentDTOS = new ArrayList<>();

    public Post(String id, Date date, String title, String body, AuthDTO author) {
        super();
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
