package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class ActionOperators {
	public static void main(String[] args) {
		//for maybe and single do on next doesn't exists
		Observable.just(1, 2, 3).map(i -> 5 / i)
		.doOnNext(i -> System.out.println("element: " + i))
		.doOnComplete(() -> System.out.println())
		.doOnError(t -> t.printStackTrace())
		.subscribe(System.out::println);
	}
}
