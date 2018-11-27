package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class RepeatAndScanOperators {
	public static void main(String[] args) {
		Observable<Integer> observable = Observable.just(1, 32, 21, 2, 44, 3, 0);
		observable.repeat(2).subscribe(System.out::println);
		
		observable.scan((total, next) -> next + total).subscribe(System.out::println);
	}
}
