package com.sumana.reactive.schedulers;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Parallelization {
	public static void main(String[] args) throws InterruptedException {
		Observable<String> source = Observable.just("green", "gray", "oragen", "red", "purple").subscribeOn(Schedulers.computation());
		source.flatMap(s -> Observable.just(s).subscribeOn(Schedulers.computation())).subscribe(System.out::println);
		Thread.sleep(50000);
	}
}
