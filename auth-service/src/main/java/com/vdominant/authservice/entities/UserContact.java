package com.vdominant.authservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_contact")
@Setter
@Getter
public class UserContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id")
    private User user;

    @Column
    private String address;
    @Column
    private String phone;
}
