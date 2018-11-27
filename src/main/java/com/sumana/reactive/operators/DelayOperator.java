package com.sumana.reactive.operators;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class DelayOperator {
	public static void main(String[] args) throws InterruptedException {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.delay(5, TimeUnit.SECONDS).subscribe(System.out::println);
		Thread.sleep(8000);
	}
}
