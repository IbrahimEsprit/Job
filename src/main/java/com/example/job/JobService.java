package com.example.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<Job> findAllJobs(){
        return jobRepository.findAll();
    }

    public Job findJobByIdOrName(int id){
        return jobRepository.findById(id);
    }

    public void updateEtat(int id,boolean etat){
        Job job = jobRepository.findById(id);
        job.setEtat(etat);
        jobRepository.save(job);
    }
}