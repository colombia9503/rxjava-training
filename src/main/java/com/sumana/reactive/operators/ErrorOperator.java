package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class ErrorOperator {
	public static void main(String[] args) {
		Observable.just(1, 2, 3, 4, 5, 3, 0, 7).map(i -> 5 / i).onErrorReturnItem(-1)
				.subscribe(s -> System.out.println("Observable 1: " + s));

		Observable.just(1, 2, 3, 4, 5, 3, 0, 7).map(i -> 5 / i).onErrorResumeNext(Observable.just(11, 22, 33))
				.subscribe(s -> System.out.println("Observable 2: " + s));
		
		Observable.just(1, 2, 3, 4, 5, 3, 0, 7).map(i -> 5 / i).onErrorReturn(t -> {
			if (t instanceof ArithmeticException)
				return -1000;
			else
				return -2;
		}).subscribe(s -> System.out.println("Observable 2: " + s));
	}
}
