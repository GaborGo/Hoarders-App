package com.hoarders.app.model.entities;

import lombok.Data;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import java.time.LocalDateTime;
import java.util.Collection;


@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String username;

    /* Audit data */
    @Version
    private long version;

    @CreatedDate
    //FIXME there is a problem on update (HTTP PUT METHOD) the created date time becomes null
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime lastModified;

    @Email
    private String email;

    //TODO: this will be calculated from the average of the ratingReceived
    //private double ratingAverage;

    private Collection<Rating> ratingsReceived;


}
