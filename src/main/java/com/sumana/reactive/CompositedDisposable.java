package com.sumana.reactive;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class CompositedDisposable {

	public static void main(String[] args) throws InterruptedException {
		Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
		Disposable disp1 = observable.subscribe(l -> System.out.println("Observer 1: " + l));
		Disposable disp2 = observable.subscribe(l -> System.out.println("Observer 2: " + l));
		Thread.sleep(5000);
		// new CompositeDisposable(disp1, disp2);
		// or
		CompositeDisposable cd = new CompositeDisposable();
		cd.addAll(disp1, disp2);
		cd.dispose();
		Thread.sleep(5000);
	}

}
