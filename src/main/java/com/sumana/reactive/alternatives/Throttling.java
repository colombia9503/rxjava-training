package com.sumana.reactive.alternatives;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Throttling {
	public static void main(String[] args) throws InterruptedException {
		Observable<String> source1 = Observable.interval(200, TimeUnit.MILLISECONDS).map(i -> (i + 1) * 200)
				.map(i -> "source1: " + i).take(10);

		Observable<String> source2 = Observable.interval(300, TimeUnit.MILLISECONDS).map(i -> (i + 1) * 300)
				.map(i -> "source2 " + i).take(10);

		Observable<String> source3 = Observable.interval(2000, TimeUnit.MILLISECONDS).map(i -> (i + 1) * 2000)
				.map(i -> "source3: " + i).take(10);

		Observable.concat(source1, source2, source3).throttleFirst(1, TimeUnit.SECONDS).subscribe(System.out::println);
		Thread.sleep(5000);
	}
}
