package com.sumana.reactive.schedulers;

import java.time.LocalTime;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class ComputationScheduler {
	public static void main(String[] args) throws InterruptedException {
		//a computational scheduler canbe used for a event loop
		Observable<String> source = Observable.just("green", "gray", "oragen", "red", "purple").subscribeOn(Schedulers.computation());
		source.subscribe(s -> System.out.println("observer 1: " + s + " on: " + LocalTime.now()));
		source.subscribe(s -> System.out.println("observer 2: " + s + " on: " + LocalTime.now()));
		Thread.sleep(3000);
	}
}
