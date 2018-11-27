package com.sumana.reactive;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObserverDisposing {
	public static void main(String[] args) {
		Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS);
		Observer<Integer> observer = new Observer<Integer>() {
			Disposable disposable;
			@Override
			public void onSubscribe(Disposable d) {
				disposable = d;
			}
			
			@Override
			public void onNext(Integer t) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
