package com.sumana.reactive.alternatives;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Switching  {
	public static void main(String[] args) throws InterruptedException {
		Observable<String> items = Observable.interval(300,  TimeUnit.MILLISECONDS).map(l -> l + " : first observable").doOnDispose(() -> System.out.println("first observable disposed"));
		
		Observable.interval(1,  TimeUnit.SECONDS)
		.switchMap(i -> items)
		.subscribe(System.out::println);
		
		Thread.sleep(5000);
	}
}
