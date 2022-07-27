package com.hoarders.app.model.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Rating {

    User from;
    LocalDateTime timestamp;
    String comment;
    StarRating star;
}
