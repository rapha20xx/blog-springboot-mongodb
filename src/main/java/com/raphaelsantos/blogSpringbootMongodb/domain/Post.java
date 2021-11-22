package com.raphaelsantos.blogSpringbootMongodb.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
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
    private User authors;

    public Post(String id, Date date, String title, String body, User authors) {
        super();
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.authors = authors;
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
