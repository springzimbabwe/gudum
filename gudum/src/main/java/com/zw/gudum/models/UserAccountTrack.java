package com.zw.gudum.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * This model represents the many-many relationship (UserAccount - Track)
 */

@Entity
public class UserAccountTrack extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserAccount userAccount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Track track;

}
