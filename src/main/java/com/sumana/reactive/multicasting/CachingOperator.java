package com.sumana.reactive.multicasting;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class CachingOperator {
	public static void main(String[] args) throws InterruptedException {
		Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS).cache();
		source.subscribe(System.out::println);
		Thread.sleep(5000);
		source.subscribe(l -> System.out.println("ob2: " + l));
	}
}
