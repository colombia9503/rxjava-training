package com.sumana.reactive.alternatives;

import io.reactivex.Observable;

public class Windowing {
	public static void main(String[] args) throws InterruptedException {
		Observable.range(0,  50).window(10).flatMapSingle(e -> e.toSortedList()).subscribe(System.out::println);
		Thread.sleep(10000);
	}
}
