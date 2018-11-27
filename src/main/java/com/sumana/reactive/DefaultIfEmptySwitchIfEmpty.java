package com.sumana.reactive;

import io.reactivex.Observable;

public class DefaultIfEmptySwitchIfEmpty {
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		
		Observable.empty().defaultIfEmpty("default").subscribe(System.out::println);
		
		Observable.empty().switchIfEmpty(observable).subscribe(System.out::println);
	}
}
