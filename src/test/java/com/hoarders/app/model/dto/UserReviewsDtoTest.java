package com.hoarders.app.model.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserReviewsDtoTest {

    @Test
    void getAverageRatingWorks() {
        UserReviewsDto myTestUserWithReviews = new UserReviewsDto();

        List<UserReviewsDto.Review> reviews = new ArrayList<>();
        reviews.add(new UserReviewsDto.Review((short)3));
        reviews.add(new UserReviewsDto.Review((short)0));
        reviews.add(new UserReviewsDto.Review((short)1));
        reviews.add(new UserReviewsDto.Review((short)5));

        myTestUserWithReviews.setReviewList(reviews);
        Assertions.assertEquals(2.25f, myTestUserWithReviews.getAverageRating());
    }
}