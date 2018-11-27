package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class TakeAndSkipOperators {
	public static void main(String[] args) throws InterruptedException {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.take(3).subscribe(System.out::println);
		observable.skip(1).subscribe(System.out::println);
		observable.first("default").subscribe(System.out::println);
		
	}
}
