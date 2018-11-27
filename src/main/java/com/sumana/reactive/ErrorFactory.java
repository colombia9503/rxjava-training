package com.sumana.reactive;

import io.reactivex.Observable;

public class ErrorFactory {
	public static void main(String[] args) {
		Observable.error(new Exception("Something goes wrong"))
		.subscribe(System.err::println, Throwable::printStackTrace, () -> System.out.println("Done"));
	}
}
