package com.diso.back_end_diso.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Replacement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String enterprise;

    @Column(nullable = false)
    private String receipt;

    @Column(nullable = false)
    private String codClient;

    @Column(nullable = false)
    private String fantasyNameClient;

    @Column(nullable = false)
    private String codItem;

    @Column(nullable = false)
    private String nameItem;

    @Column(nullable = false)
    private int unit;

    @Column(nullable = false)
    private int exb;

    @Column(nullable = false)
    private int box;

    @Column(nullable = false)
    private String motive;

    @Column(nullable = false)
    private String target;

    @Column(nullable = false)
    private String date;

    @Temporal(TemporalType.TIME)
    @Column
    private Date manualDate;

    @Temporal(TemporalType.TIME)
    @Column
    private Date createdAt;

    @Temporal(TemporalType.TIME)
    @Column
    private Date updatedAt;

    @Column
    private String note;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id"
            //,nullable = false
    )
    private User user;

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Date();
    }





}
