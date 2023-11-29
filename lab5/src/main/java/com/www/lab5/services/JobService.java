package com.www.lab5.services;

import com.www.lab5.models.Job;
import com.www.lab5.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<Job> getJobsOfCompany(Long companyId) {
        return jobRepository.findByCompanyId(companyId);
    }

}
