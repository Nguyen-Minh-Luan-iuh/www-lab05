package com.www.lab5.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id")
    private long id;
    @Column(columnDefinition = "NVARCHAR(2000)")
    private String about;
    private String email;
    @Column(name = "comp_name")
    private String compName;
    private String phone;
    @Column(name = "web_url")
    private String webUrl;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private Address address;

    public Company(String about, String email, String compName, String phone, String webUrl, Address address) {
        this.about = about;
        this.email = email;
        this.compName = compName;
        this.phone = phone;
        this.webUrl = webUrl;
        this.address = address;
    }
}
