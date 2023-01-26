package com.zw.gudum.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Search extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserAccount userAccount;

    /**
     * search_term (Search term used by the user)
     * result (Results of the search)
     * filter (Filter used by the user)
     */
}
