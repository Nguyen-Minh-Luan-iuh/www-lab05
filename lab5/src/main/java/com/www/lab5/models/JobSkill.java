package com.www.lab5.models;

import com.www.lab5.enums.SkillLevel;
import com.www.lab5.ids.JobSkillId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@IdClass(JobSkillId.class)
@Table(name = "job_skill")
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "more_infos")
    private String moreInfos;
    @Column(name = "skill_level")
    private SkillLevel skillLevel;


}
