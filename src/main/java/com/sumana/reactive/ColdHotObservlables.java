package com.sumana.reactive;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class ColdHotObservlables {

	public static void main(String[] args) {
		Observable<String> coldObservable = Observable.just("first", "second", "third");

		coldObservable.subscribe(str -> System.out.println("Observable 1: " + str));
		coldObservable.subscribe(str -> System.out.println("Observable 2: " + str));

		System.out.println("-------------- cold iterable factory ---------------");

		List<String> list = Arrays.asList("foo", "fo", "f", "fa");
		// it return a cold observable
		Observable<String> coldObservableFromIterable = Observable.fromIterable(list);
		// Cold observable to hot
		ConnectableObservable<String> hotObservable = coldObservableFromIterable.publish();
		
		//this isn't multithread
		hotObservable.subscribe(str -> System.out.println("Observable 1: " + str));
		hotObservable.subscribe(str -> System.out.println("Observable 2: " + str));
		hotObservable.connect();

	}

}
