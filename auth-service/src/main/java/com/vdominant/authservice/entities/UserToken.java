package com.vdominant.authservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_tokens")
@Getter
@Setter
public class UserToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;

    @Column(nullable = false, unique = true)
    private String token;
    @Column(nullable = false)
    private LocalDateTime expiryDate;
}
