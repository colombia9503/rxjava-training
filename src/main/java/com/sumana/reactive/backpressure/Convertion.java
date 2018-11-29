package com.sumana.reactive.backpressure;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Convertion {
	public static void main(String[] args) throws InterruptedException {
		Observable<String> source1 = Observable.just("hola", "como", "estas").subscribeOn(Schedulers.newThread());
		Flowable<String> flow = source1.toFlowable(BackpressureStrategy.BUFFER);
		flow.subscribe(System.out::println);
		flow.toObservable().map(s -> "converted to observable papi"+s).subscribe(System.out::println);
		Thread.sleep(100);
		
		
	}
}
