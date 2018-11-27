package com.sumana.reactive;

import io.reactivex.Observable;

public class DistinctAndElementAt {
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega", "Omega");
		observable.distinct(String::length).subscribe(System.out::println);
		observable.elementAt(2).subscribe(System.out::println);
		
	}
}
