package com.example.job;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository  extends JpaRepository<Job, Integer> {
    Job findById(int id);
}
