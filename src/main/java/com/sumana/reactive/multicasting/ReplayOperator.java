package com.sumana.reactive.multicasting;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class ReplayOperator {
	public static void main(String[] args) throws InterruptedException {
		// replay the last N operations for a observable, then if any other observable
		// is passed it gonna pass that N replayed streams
		Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS).replay(4).autoConnect();
		source.subscribe(System.out::println);
		Thread.sleep(5000);
		source.subscribe(l -> System.out.println("ob2: " + l));
	}
}
