package com.www.lab5.controllers;

import com.www.lab5.dtos.CompanyDto;
import com.www.lab5.models.Company;
import com.www.lab5.models.Job;
import com.www.lab5.services.CompanyService;
import com.www.lab5.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private JobService jobService;

    @GetMapping("/new")
    public String showFormAddCompany(Model model) {
        CompanyDto companyDto = new CompanyDto();
        model.addAttribute("type", "ADD");
        model.addAttribute("company", companyDto);
        return "create_company";
    }

    @PostMapping("")
    public String saveCompany(@ModelAttribute("company")CompanyDto companyDto) {
        companyService.create(companyDto);

        return "redirect:/companies";
    }

    @GetMapping("/{id}")
    public String getDetailCompany(@PathVariable("id")long id, Model model) {
        Optional<Company> companyOptional = companyService.findById(id);

        if (companyOptional.isEmpty()) {
            return "redirect:/companies";
        }

        Company company = companyOptional.get();
        List<Job> jobs = jobService.getJobsOfCompany(id);

        model.addAttribute("type", "UPDATE");
        model.addAttribute("company", company);
        model.addAttribute("jobs", jobs);

        return "company_detail";
    }

    @GetMapping("")
    public String getAllCompany(Model model) {
        List<Company> companies = companyService.findAll();
        model.addAttribute("companies", companies);
        return  "company";
    }

}
