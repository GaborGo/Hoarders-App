package com.hoarders.app.model.entities;

public enum StarRating {

    ZERO(0),

    ONE(1),

    TWO(2),

    THREE(3),

    FOUR(4),

    FIVE(5);
    private final short number;
    StarRating(int number) {
        this.number = (short)number;
    }

    public short getNumber() {
        return number;
    }
}
