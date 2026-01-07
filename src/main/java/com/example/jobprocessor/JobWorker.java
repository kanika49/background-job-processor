package com.example.jobprocessor;

public class JobWorker implements Runnable {

    private final Job job;
    private static final int MAX_RETRIES = 3;

    public JobWorker(Job job) {
        this.job = job;
    }

    @Override
    public void run() {
        while (job.incrementAttempts() <= MAX_RETRIES) {
            try {
                System.out.println("Processing job " + job.getJobId() +
                        " (attempt " + job.incrementAttempts() + ")");
                Thread.sleep(1000);

                if (Math.random() < 0.5) {
                    throw new RuntimeException("Job failed");
                }

                System.out.println("Job " + job.getJobId() + " completed successfully");
                return;

            } catch (Exception e) {
                System.out.println("Retrying job " + job.getJobId());
            }
        }
        System.out.println("Job " + job.getJobId() + " moved to dead-letter queue");
    }
}

