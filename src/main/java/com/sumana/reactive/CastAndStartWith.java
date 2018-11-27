package com.sumana.reactive;

import io.reactivex.Observable;

public class CastAndStartWith {
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.cast(Object.class).subscribe(System.out::println);
		observable.startWith("Here is it -> ").subscribe(System.out::println);
	}
}
