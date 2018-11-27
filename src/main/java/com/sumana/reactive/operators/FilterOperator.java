package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class FilterOperator {
	public static void main(String[] args) throws InterruptedException {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.filter(s -> s.equals("Omega")).subscribe(System.out::println);
	}
}
