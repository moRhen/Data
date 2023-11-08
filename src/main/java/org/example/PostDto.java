package org.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    long id;
    int userId;
    String title;
    String body;
    String comment;
    @JsonIgnore
    long recordId;

    public PostDto setId(long id) {
        this.id = id;
        return this;
    }

    public PostDto setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public PostDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public PostDto setBody(String body) {
        this.body = body;
        return this;
    }

    public PostDto setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public PostDto setRecordId(long recordId) {
        this.recordId = recordId;
        return this;
    }

}
