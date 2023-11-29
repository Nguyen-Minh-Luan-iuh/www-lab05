package com.www.lab5.ids;

import com.www.lab5.models.Job;
import com.www.lab5.models.Skill;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Embeddable
public class JobSkillId  implements Serializable {
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
}
