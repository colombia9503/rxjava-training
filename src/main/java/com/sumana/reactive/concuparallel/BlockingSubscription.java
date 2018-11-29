package com.sumana.reactive.concuparallel;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class BlockingSubscription {
	public static void main(String[] args) {
		//not recomended blocks the thread
		Observable.interval(1, TimeUnit.SECONDS).take(10)
		.blockingSubscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("observer 1: done"));
		
		Observable.interval(1, TimeUnit.SECONDS).take(5)
		.blockingSubscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("observer 2: done"));
	}
}
