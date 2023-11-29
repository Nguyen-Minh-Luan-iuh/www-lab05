package com.www.lab5.repositories;

import com.www.lab5.ids.CandidateSkillId;
import com.www.lab5.models.CandidateSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillId> {
}
