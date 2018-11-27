package com.sumana.reactive.combinations;

import io.reactivex.Observable;
import io.reactivex.Single;

public class ConcatAndConcatWith {
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Omega", "Delta");
		Observable<String> observable1 = Observable.just("Epsilon", "Gamma");
		Observable.concat(observable, observable1).subscribe(System.out::println);
		observable1.concatWith(observable).subscribe(System.out::println);
		observable.concatMap(s -> Observable.fromArray(s.split(""))).subscribe(System.out::println);
		observable.flatMapSingle(s -> Single.just(s)).subscribe(System.out::println);
	}
}
