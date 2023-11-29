package com.www.lab5.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dob;
    @Column(unique = true)
    private String email;
    @Column(name = "full_name")
    private String fullName;
    @Column(unique = true)
    private String phone;
    @OneToOne
    @JoinColumn(name = "address")
    private Address address;
}
