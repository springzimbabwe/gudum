package com.zw.gudum.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserAccount userAccount;

    /**
     * amount (Amount of the transaction)
     * time (Time of the transaction)
     * details (Details of the transaction like purchase or subscription)
     */
}
