package com.sumana.reactive;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RangeAndIntervalFactory {
	public static void main(String[] args) throws InterruptedException {
		//interval factory example
		// Observable.interval(200,
		// TimeUnit.MILLISECONDS).subscribe(System.out::println);
		// Thread.sleep(5000);
		
		Observable.range(0, 15).subscribe(System.out::println);
	}
}
