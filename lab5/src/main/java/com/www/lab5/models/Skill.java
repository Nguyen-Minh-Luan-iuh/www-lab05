package com.www.lab5.models;

import com.www.lab5.enums.SkillType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;
    @Column(name = "skill_desc")
    private String skillDesc;
    @Column(name = "skill_name")
    private String skillName;
    @Column(name = "skill_type")
    private SkillType skillType;

    public Skill(long id) {
        this.id = id;
    }
}
