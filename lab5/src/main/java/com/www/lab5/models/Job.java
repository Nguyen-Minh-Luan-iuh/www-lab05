package com.www.lab5.models;

import com.www.lab5.enums.SkillLevel;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;
    @Column(name = "job_desc")
    private String jobDesc;
    @Column(name = "job_name")
    private String jobName;
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

    @OneToMany(mappedBy = "job", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<JobSkill> jobSkills = new ArrayList<>();

    public Job(String jobDesc, String jobName, Company company) {
        this.jobDesc = jobDesc;
        this.jobName = jobName;
        this.company = company;
    }

    public void addJobSKill(long skillId, SkillLevel skillLevel){
        Skill skill = new Skill(skillId);
        JobSkill jobSkill = new JobSkill(this, skill, "", skillLevel);
        this.jobSkills.add(jobSkill);
    }
}
