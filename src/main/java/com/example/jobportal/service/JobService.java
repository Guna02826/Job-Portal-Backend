package com.example.jobportal.service;

import com.example.jobportal.model.Job;
import com.example.jobportal.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository repo;

    public JobService(JobRepository repo) {
        this.repo = repo;
    }

    public List<Job> getAllJobs() {
        return repo.findAll();
    }

    public Job createJob(Job job) {
        return repo.save(job);
    }

    public Job getJob(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteJob(Long id) {
        repo.deleteById(id);
    }
}
