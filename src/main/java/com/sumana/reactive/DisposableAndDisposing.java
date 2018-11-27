package com.sumana.reactive;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class DisposableAndDisposing {

	public static void main(String[] args) throws InterruptedException {
		Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS);
		Disposable disposable = source.subscribe(System.out::println);
		Thread.sleep(5000);
		disposable.dispose();
		Thread.sleep(5000);
	}

}
