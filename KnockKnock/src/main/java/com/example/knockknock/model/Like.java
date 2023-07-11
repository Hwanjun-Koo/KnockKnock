package com.example.knockknock.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LIKE_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    private Post post;

    @Column(name = "IS_LIKED")
    private boolean isLiked;

    public void like() {
        this.isLiked = true;
    }

    public void disLike() {
        this.isLiked = false;
    }
}
