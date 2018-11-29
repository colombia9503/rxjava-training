package com.sumana.reactive.backpressure;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

public class FlowablesFactory {
	public static void main(String[] args) throws InterruptedException {
		Flowable.range(0, 5000000).subscribeOn(Schedulers.computation()).doOnNext(s -> System.out.println("emission : " + s + " coming")).subscribe(new Subscriber<Integer>() {

			@Override
			public void onSubscribe(Subscription s) {
				// TODO Auto-generated method stub
				s.request(Long.MAX_VALUE);
			}

			@Override
			public void onNext(Integer t) {
				System.out.println(t);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub

			}
		});
		
		Thread.sleep(15000);
	}
}
