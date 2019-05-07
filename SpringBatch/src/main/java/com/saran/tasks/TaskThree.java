package com.saran.tasks;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskThree implements Tasklet{
	String taskThree = "taskThree";
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Task three is started");
		System.out.println(taskThree.toUpperCase());
		System.out.println("Task three is finished");
		return RepeatStatus.FINISHED;
	}

}
