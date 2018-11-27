package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class OtherReducingOperators {
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.all(s -> s.length() == 4).subscribe(System.out::println);
		
		observable.any(s -> s.contains("e")).subscribe(System.out::println);
		
		observable.count().subscribe(System.out::println);
	}
}
