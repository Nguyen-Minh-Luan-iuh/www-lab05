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
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String company;
    @Column(name = "from_date")
    private LocalDate fromDate;
    private String role;
    @Column(name = "to_date")
    private String toDate;
    @Column(name = "work_desc")
    private String workDesc;
    @ManyToOne
    @JoinColumn(name = "candiate")
    private Candidate candidate;
}
