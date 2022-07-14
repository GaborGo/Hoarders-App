package com.hoarders.app.model.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collation = "users")
public class User {

    @Id
    private String id;

    private String username;
}
