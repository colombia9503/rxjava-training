package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class TakeWhileAndSkipWhile {
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.takeWhile(e -> e.length() > 4).subscribe(System.out::println);
		
		observable.skipWhile(s -> !s.equals("Zeta")).subscribe(System.out::println);
		
	}
}
