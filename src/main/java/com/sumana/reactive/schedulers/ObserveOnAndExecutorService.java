package com.sumana.reactive.schedulers;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class ObserveOnAndExecutorService {
	public static void main(String[] args) throws InterruptedException {
		Observable<String> source = Observable.just("green", "gray", "oragen", "red", "purple").subscribeOn(Schedulers.computation());
		source.subscribe(s -> System.out.println("observer 1: " + s + " on: " + LocalTime.now()));
		source.subscribe(s -> System.out.println("observer 2: " + s + " on: " + LocalTime.now()));
		//setting a new scheduler
		source.observeOn(Schedulers.io());
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Scheduler scheduler = Schedulers.from(executorService);
		scheduler.shutdown(); //stop the scheduler
		Schedulers.shutdown(); //stop all schedulers
		scheduler.start(); //restart a scheduler
		Schedulers.start(); //restart all schedulers
		Thread.sleep(3000);
	}
}
