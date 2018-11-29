package com.sumana.reactive.backpressure;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

public class Strategies {
	public static void main(String[] args) throws InterruptedException {
		Flowable<String> flowable = Flowable.create(source -> {
			source.onNext("process1");
			source.onNext("process2");
		}, BackpressureStrategy.BUFFER);
		flowable.subscribeOn(Schedulers.computation()).subscribe(System.out::println);
		Thread.sleep(1000);
	}
}
