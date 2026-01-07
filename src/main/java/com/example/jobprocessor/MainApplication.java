package com.example.jobprocessor;

public class MainApplication {

    public static void main(String[] args) {

        Job job1 = new Job("JOB-101");
        Job job2 = new Job("JOB-102");

        Thread worker1 = new Thread(new JobWorker(job1));
        Thread worker2 = new Thread(new JobWorker(job2));

        worker1.start();
        worker2.start();
    }
}

