package com.sumana.reactive.operators;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import io.reactivex.Observable;

public class CollectOperator {
	public static void main(String[] args) {
		Observable<String> observable = Observable.just("Alpha", "Beta", "Zeta", "Omega");
		observable.toMultimap(s -> s.charAt(0), String::length, HashMap::new).subscribe(System.out::println);
		observable.collect(HashSet::new, HashSet::add).subscribe(System.out::println);
		observable.collect(LinkedList::new, LinkedList::add).subscribe(System.out::println);
	}
}
