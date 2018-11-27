package com.sumana.reactive.combinations;

import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

public class GroupByOperator {
	public static void main(String[] args) {
		Observable<String> source1 = Observable.just("black", "blue", "train", "yellow", "plane", "purple");
		Observable<GroupedObservable<Character, String>> groups = source1.groupBy(s -> s.charAt(0));
		groups.flatMapSingle(g -> g.toList()).subscribe(System.out::println);
		groups.flatMapSingle(g -> g.reduce((s1, s2) -> s1.equals("") ? "" : s1 + "," + s2).map(s -> g.getKey() + ":" + s).toSingle()).subscribe(System.out::println);
	}
}
