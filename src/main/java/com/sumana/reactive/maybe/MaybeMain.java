package com.sumana.reactive.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;

public class MaybeMain {
	public static void main(String[] args) {
		//it can be used for a filter, it means that it can return 1 emittion or zero emittions
		MaybeObserver<String> maybeObserver = new MaybeObserver<String>() {
			
			@Override
			public void onSuccess(String arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onSubscribe(Disposable arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onError(Throwable arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
