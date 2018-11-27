package com.sumana.reactive.combinations;

import io.reactivex.Observable;

public class FlatMapOperator {
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Omega", "Delta", "Epsilon", "Gamma");
		observable.flatMap(o -> {
			System.out.println(o);
			return Observable.fromArray(o.split(""));
		}).subscribe(System.out::println);
		observable.flatMap(o -> Observable.just(o)).subscribe(System.out::println);
	}
}
