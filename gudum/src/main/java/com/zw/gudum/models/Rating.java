package com.zw.gudum.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Rating extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "track_id")
    private Track track;

    /**
     * rating (Rating given by the user)
     * track (Track for which the rating is given)
     * user (User who gave the rating)
     */
}
