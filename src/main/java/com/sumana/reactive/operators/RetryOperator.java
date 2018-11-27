package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class RetryOperator {
	public static void main(String[] args) {
		Observable.just(1, 2, 3, 4, 5, 3, 0, 7).map(i -> 5 / i).retry(2)
		.subscribe(s -> System.out.println("Observable 1: " + s));
	}
}
