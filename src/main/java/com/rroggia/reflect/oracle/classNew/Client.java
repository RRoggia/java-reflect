package com.rroggia.reflect.oracle.classNew;

import java.util.HashSet;
import java.util.Set;

public class Client {
	public static void main(String[] args) {

		Class<? extends String> stringClazz = "foo".getClass();
		System.out.println(stringClazz);

		// Class<? extends Console> consoleClazz = System.console().getClass();
		// System.err.println(consoleClazz);

		Class<? extends Enum> enumClazz = Enum.A.getClass();
		System.out.println(enumClazz);

		byte[] bytes = new byte[1024];
		Class<? extends Object> arrayClazz = bytes.getClass();
		System.out.println(arrayClazz);

		Set<String> set = new HashSet<>();
		Class<? extends Set> interfaceClazz = set.getClass();
		System.out.println(interfaceClazz);
	}

	enum Enum {
		A, B;
	}
}
