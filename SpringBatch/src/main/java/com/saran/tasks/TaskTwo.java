package com.saran.tasks;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskTwo implements Tasklet{
	String taskTwo = "taskTwo";
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Task two is started");
		System.out.println(taskTwo.toUpperCase());
		System.out.println("Task two is finished");
		return RepeatStatus.FINISHED;
	}

}
