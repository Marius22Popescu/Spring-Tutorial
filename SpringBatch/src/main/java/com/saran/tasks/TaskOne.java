package com.saran.tasks;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskOne implements Tasklet{

	String taskOne = "taskOne";
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Task one is started");
		System.out.println(taskOne.toUpperCase());
		System.out.println("Task one is finished");
		return RepeatStatus.FINISHED;
	}

}
