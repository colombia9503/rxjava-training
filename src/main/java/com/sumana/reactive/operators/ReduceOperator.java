package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class ReduceOperator {
	public static void main(String[] args) {
		//this operation reduces the observable into a maybe
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.reduce((actual, next) -> actual + (next.equals("") ? "" : "," + next)).subscribe(System.out::println);
	}
}
