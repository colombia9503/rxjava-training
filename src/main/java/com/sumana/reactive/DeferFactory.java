package com.sumana.reactive;

import io.reactivex.Observable;

public class DeferFactory {
	public static int a = 0, b = 10;

	public static void main(String[] args) {
		// Observable<Integer> source = Observable.range(a, b);
		Observable<Integer> source = Observable.defer(() -> Observable.range(a, b));
		source.subscribe(System.out::println);
		b = 15;
		source.subscribe(e -> System.out.println("Observer 2: " + e));
	}

}
