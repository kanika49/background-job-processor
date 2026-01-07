package com.example.jobprocessor;

public class Job {

    private final String jobId;
    private int attempts = 0;

    public Job(String jobId) {
        this.jobId = jobId;
    }

    public String getJobId() {
        return jobId;
    }

    public int incrementAttempts() {
        return ++attempts;
    }
}

