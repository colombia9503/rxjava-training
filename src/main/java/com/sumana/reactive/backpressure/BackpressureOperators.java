package com.sumana.reactive.backpressure;

import java.util.concurrent.TimeUnit;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.Flowable;

public class BackpressureOperators {
	public static void main(String[] args) {
		Flowable<Long> source = Flowable.interval(1, TimeUnit.SECONDS);
		source.onBackpressureBuffer(10, () -> System.out.println("overflow"), BackpressureOverflowStrategy.DROP_LATEST);
		source.onBackpressureLatest();
		source.onBackpressureDrop(); //drop all the emissions
	}
}
