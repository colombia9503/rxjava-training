package com.sumana.reactive;

import io.reactivex.Completable;

public class CompletableObservables {

	public static void main(String[] args) {
		Completable.fromRunnable(() -> System.out.println("calling on complete"))
			.subscribe(() -> System.out.println("COMPLETED!"));
	}

}
