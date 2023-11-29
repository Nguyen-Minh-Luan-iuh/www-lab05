package com.www.lab5.controllers;

import com.www.lab5.enums.SkillLevel;
import com.www.lab5.models.Job;
import com.www.lab5.models.Skill;
import com.www.lab5.services.JobService;
import com.www.lab5.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/companies/{id}")
public class JobController {
    @Autowired
    private JobService jobService;
    @Autowired
    private SkillService skillService;

    @GetMapping("/job")
    public String showFormAddJob(@PathVariable("id")long id, Model model) {
        SkillLevel[] skillLevels = SkillLevel.values();
        List<Skill> skills = skillService.getAll();
        Job job = new Job();

        model.addAttribute("job", job);
        model.addAttribute("skills", skills);
        model.addAttribute("SkillLevels", skillLevels);
        model.addAttribute("companyId", id);

        return "create_job";
    }
}
