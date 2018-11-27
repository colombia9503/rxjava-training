package com.sumana.reactive;

import java.util.concurrent.Future;

import io.reactivex.Observable;

public class FutureEmptyNeverObservables {
	public static void main(String[] args) {
		Observable.never();
		Observable.empty();
		
		Future<String> future = ...;
		Observable.fromFuture(future)
		.map(String::length)
		.subscribe(System.out::println);
	}
}
