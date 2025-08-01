package com.example.jobportal.controller;

import com.example.jobportal.model.Job;
import com.example.jobportal.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*") // allow frontend access
public class JobController {

    private final JobService service;

    public JobController(JobService service) {
        this.service = service;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return service.getAllJobs();
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        job.setPostedAt(java.time.LocalDateTime.now());
        return service.createJob(job);
    }

    @GetMapping("/{id}")
    public Job getJob(@PathVariable Long id) {
        return service.getJob(id);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        service.deleteJob(id);
    }
}
