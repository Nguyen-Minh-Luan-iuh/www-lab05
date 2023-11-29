package com.www.lab5.models;

import com.www.lab5.enums.SkillLevel;
import com.www.lab5.ids.CandidateSkillId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@IdClass(CandidateSkillId.class)
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Column(name = "more_infos")
    private String moreInfos;
    @Column(name = "skill_level")
    private SkillLevel skillLever;
}
