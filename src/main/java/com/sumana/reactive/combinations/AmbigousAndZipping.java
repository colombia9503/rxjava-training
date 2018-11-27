package com.sumana.reactive.combinations;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class AmbigousAndZipping {

	public static void main(String[] args) throws InterruptedException {
		Observable<Long> s1 = Observable.interval(1, TimeUnit.SECONDS);
		Observable<Long> s2 = Observable.interval(300, TimeUnit.MILLISECONDS);
		Observable.ambArray(s1, s2).subscribe(System.out::println);
		Thread.sleep(5000);
		
		Observable<String> observable = Observable.just("Alpha", "Beta", "Omega", "Delta");
		Observable<String> observable1 = Observable.just("Epsilon", "Gamma");
		Observable.zip(observable, observable1, (e1, e2) -> {return e1 + "-" + e2;}).subscribe(System.out::println);
	}

}
