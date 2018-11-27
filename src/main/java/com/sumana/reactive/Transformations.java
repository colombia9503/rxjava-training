package com.sumana.reactive;

import io.reactivex.Observable;

public class Transformations {

	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.map(s -> s.toUpperCase()).map(s -> s.length()).subscribe(System.out::println);

	}

}
