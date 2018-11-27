package com.sumana.reactive.multicasting;

import io.reactivex.Observable;

public class MulticastingOperatorsAndAutoconnect {
	public static void main(String[] args) {
		//avoids the creations of a connectable observalble for hot observables
		Observable<Integer> source = Observable.range(1,  3).map(i -> i+5).publish().autoConnect(2);
		source.subscribe(i -> System.out.println("Observer 1: " + i));
		source.subscribe(i -> System.out.println("Observer 2: " + i));
	}
}
