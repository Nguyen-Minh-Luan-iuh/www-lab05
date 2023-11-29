package com.www.lab5.repositories;

import com.www.lab5.ids.JobSkillId;
import com.www.lab5.models.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {
}
