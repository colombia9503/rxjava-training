package com.sumana.reactive;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Create factory
		// Observable<String> source = Observable.create(emtter -> {
		// try {
		// emtter.onNext("One");
		// } catch (Exception e) {
		// emtter.onError(e);
		// }
		// emtter.onNext("Second");
		// emtter.onNext("Three");
		// emtter.onComplete();
		// });

		// Just Factory
		Observable<String> source2 = Observable.just("First", "Second", "Third");
		Observer<String> observer = new Observer<String>() {

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				System.out.println("Stream completed");
			}

			@Override
			public void onError(Throwable arg0) {
				// TODO Auto-generated method stub
				System.err.println("Something goes wrong");
			}

			@Override
			public void onNext(String arg0) {
				// TODO Auto-generated method stub
				System.out.println(arg0);

			}

			@Override
			public void onSubscribe(Disposable arg0) {
				// TODO Auto-generated method stub

			}
		};

		// source2.subscribe(observer);
		
		source2.subscribe(System.out::println, Throwable::printStackTrace,  () -> {System.out.println("Stream completed shortly");});
	
		System.out.println("------------- from Iterable Factory -----------------");
		
		//just observable returns a cold observable
		
	}
}
