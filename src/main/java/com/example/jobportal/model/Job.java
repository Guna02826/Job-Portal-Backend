package com.example.jobportal.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String companyName;
    private String location;
    private String jobType;
    private Integer salaryMin;
    private Integer salaryMax;
    private LocalDateTime deadline;
    private String description;
    private LocalDateTime postedAt;
}
