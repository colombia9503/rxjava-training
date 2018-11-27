package com.sumana.reactive.operators;

import java.util.Comparator;

import io.reactivex.Observable;

public class SortedOperator {
	public static void main(String[] args) {
		Observable<Integer> observable = Observable.just(1, 32, 21, 2, 44, 3, 0);
		observable.sorted(Comparator.reverseOrder()).subscribe(System.out::println);
	}
}
