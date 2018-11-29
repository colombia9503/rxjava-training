package com.sumana.reactive.alternatives;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Buffering {
	public static void main(String[] args) throws InterruptedException {
		Observable.range(0,  100).buffer(10).subscribe(System.out::println);
		Observable.interval(300, TimeUnit.MILLISECONDS).buffer(1, TimeUnit.SECONDS).subscribe(System.out::println);
		Thread.sleep(10000);
	}
}
