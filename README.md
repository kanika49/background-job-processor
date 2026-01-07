# Failure-Resilient Background Job Processor

## Overview
A Java-based background job processing system designed to handle long-running
tasks with retry logic and failure isolation.

## Tech Stack
- Java
- Multithreading
- Asynchronous Processing

## Design
- Jobs are processed asynchronously by worker threads
- Failed jobs are retried with a maximum retry limit
- Jobs exceeding retry limits are moved to a dead-letter queue (simulated)

## Features
- Background job execution
- Retry mechanism with failure handling
- Dead-letter queue simulation

## How to Run
1. Compile all Java files
2. Run MainApplication.java



