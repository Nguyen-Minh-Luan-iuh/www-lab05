package com.www.lab5.ids;

import com.www.lab5.models.Candidate;
import com.www.lab5.models.Skill;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class CandidateSkillId implements Serializable {
    @ManyToOne
    @JoinColumn(name="can_id")
    private Candidate candidate;
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
}
