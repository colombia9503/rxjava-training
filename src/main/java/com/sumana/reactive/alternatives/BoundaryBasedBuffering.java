package com.sumana.reactive.alternatives;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class BoundaryBasedBuffering {
	public static void main(String[] args) throws InterruptedException {
//		Observable.interval(300, TimeUnit.MILLISECONDS).buffer(5, 6).subscribe(System.out::println);
		Observable.interval(300, TimeUnit.MILLISECONDS).buffer(Observable.interval(1, TimeUnit.SECONDS)).subscribe(System.out::println);
		Thread.sleep(10000);
	}
}
