package com.www.lab5.services;

import com.www.lab5.models.Skill;
import com.www.lab5.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public Skill create(Skill skill) {
        return skillRepository.save(skill);
    }

    public List<Skill> getAll() {
        return skillRepository.findAll();
    }

    public Optional<Skill> findById(long id) {
        return skillRepository.findById(id);
    }

}
