package com.sumana.reactive.operators;

import io.reactivex.Observable;

public class ToListToSortedListToMapOperators {
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.toList().subscribe(System.out::println);
		observable.toSortedList().subscribe(System.out::println);
		observable.toMap(s -> s.charAt(0)).subscribe(System.out::println);
		observable.toMultimap(String::length).subscribe(System.out::println);
	}
}
