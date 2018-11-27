package com.sumana.reactive.single;

import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class SingleMain {
	public static void main(String[] args) {
//		SingleObserver<String> observer = new SingleObserver<String>() {
//			
//			@Override
//			public void onSuccess(String arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void onSubscribe(Disposable arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void onError(Throwable arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		Observable.just("a", "b").first("anything").subscribe(System.out::println);
	}
}
