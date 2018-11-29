package com.sumana.reactive.schedulers;

public class Main {
	//Scheduler.computation -> used when you have tu use the CPU for operations, it considers the status of the CPU
	//Scheduler.IO  used when you have any Input Output operation
	//Scheduler.newThread it creates a new thread and destroy after the observable finish the emittion
	//Scheduler.Single it creates a new thread for managing secuencially the single observers
}
