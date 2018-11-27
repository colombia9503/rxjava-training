package com.sumana.reactive.combinations;

import java.util.Arrays;

import io.reactivex.Observable;

public class CombinationsMain {
	public static void main(String[] args) {
		Observable<String> ob1 = Observable.just("a", "b");
		Observable<String> ob2 = Observable.just("c", "d");
		Observable<String> ob3 = Observable.just("e", "f");
		Observable<String> ob4 = Observable.just("g", "h");
		Observable<String> ob5 = Observable.just("i", "j");
		Observable<String> ob6 = Observable.just("k", "l");
		Observable.merge(Arrays.asList(ob1, ob2, ob3, ob4, ob5, ob6)).subscribe(System.out::println);
		
		Observable.just("asdasd").mergeWith(ob1).subscribe(System.out::println);
	}
}
