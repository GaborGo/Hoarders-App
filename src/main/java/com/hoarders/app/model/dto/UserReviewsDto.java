package com.hoarders.app.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserReviewsDto {
    String userId;
    float averageRating;
    List<Review> reviewList;

    static class Review{
        short score;
        String comment;

        Review(short score){
            this.score = score;
        }
    }

    public float getAverageRating() {
     return reviewList.stream().mapToInt((review)->review.score).reduce(0 , (score1, score2) -> score1+score2)/(float)reviewList.size();
    }
}
