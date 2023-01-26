package com.zw.gudum.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Playlist extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserAccount userAccount;

    /**
     * title (Title of the playlist)
     * user (User who created the playlist)
     * tracks (List of tracks in the playlist)
     */

}
