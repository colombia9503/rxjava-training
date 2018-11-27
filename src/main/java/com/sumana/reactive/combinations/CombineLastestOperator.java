package com.sumana.reactive.combinations;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class CombineLastestOperator {
	public static void main(String[] args) throws InterruptedException {
		Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
		Observable<Long> observable1 = Observable.interval(300, TimeUnit.MILLISECONDS);
		//combine all the operatos
		Observable.combineLatest(observable, observable1, (e1, e2) -> {return "s1: " + e1 + "- s2: " + e2;}).subscribe(System.out::println);
		Thread.sleep(5000);
		
		//compare only with the lastest operator
		observable.withLatestFrom(observable1, (e1, e2) -> {return "ss1: " + e1 + "- ss2: " + e2;}).subscribe(System.out::println);
		Thread.sleep(5000);
	}
}
