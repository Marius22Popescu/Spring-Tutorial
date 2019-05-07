package com.saran.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.saran.tasks.TaskOne;
import com.saran.tasks.TaskThree;
import com.saran.tasks.TaskTwo;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	@Autowired
	private JobBuilderFactory jobs;
	@Autowired
	private StepBuilderFactory steps;
	@Bean
	public Step stepOne() {
		return steps.get("stepOne").tasklet(new TaskOne()).build();
	}
	@Bean
	public Step stepTwo() {
		return steps.get("stepTwo").tasklet(new TaskTwo()).build();
	}
	@Bean
	public Step stepThree() {
		return steps.get("stepThree").tasklet(new TaskThree()).build();
	}
	@Bean
	public Job testJob() {
		return jobs.get("testJob").incrementer(new RunIdIncrementer())
				.start(stepOne())
				.next(stepThree())
				.next(stepTwo())
				.build();
	}

}
