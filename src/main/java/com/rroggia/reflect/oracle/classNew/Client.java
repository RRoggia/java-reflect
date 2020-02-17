package com.rroggia.reflect.oracle.classNew;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class Client {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {

		System.out.println("getClass()");
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

		@SuppressWarnings("rawtypes")
		Class<? extends Set> interfaceClazz = set.getClass();
		System.out.println(interfaceClazz);

		System.out.println();
		System.out.println(".class");

		Class<Boolean> primitiveClazz = boolean.class;
		System.out.println(primitiveClazz);

		Class<?> multidimensionalArrayClazz = int[][][].class;
		System.out.println(multidimensionalArrayClazz);

		System.out.println();
		System.out.println("forName()");

		try {
			Class<?> clientClazz = Class.forName("com.rroggia.reflect.oracle.classNew.Client");
			System.out.println(clientClazz);

			Class<?> doubleArrayClazz = Class.forName("[D");
			System.out.println(doubleArrayClazz);

		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound");
		}

		System.out.println();
		System.out.println(".TYPE");
		Class<Void> type = Void.TYPE;
		System.out.println(type);

		System.out.println();
		System.out.println("methods that return Class");

		System.out.println();
		System.out.println("getSuperclass");
		Class<? super Integer> integerSuperClazz = Integer.class.getSuperclass();
		System.out.println(integerSuperClazz);

		System.out.println();
		System.out.println(
				"getClasses - Returns all the public classes, interfaces, and enums that are members of the class including inherited members.");
		Class<?>[] integerClazzes = Character.class.getClasses();
		for (Object a : integerClazzes)
			System.out.println(a);

		System.out.println();
		System.out.println(
				"getDeclaredClasses - Returns all of the classes interfaces, and enums that are explicitly declared in this class.");
		Class<?>[] declaredClazzes = Character.class.getDeclaredClasses();
		for (Object a : declaredClazzes)
			System.out.println(a);

		System.out.println();
		System.out.println(
				"getDeclaringClass - returns the Class object representing the class in which it was declared.");

		Field field = System.class.getField("out");
		Class<?> declaringClass = field.getDeclaringClass();
		Class<?> class1 = System.class.getClass();
		System.out.println(declaringClass);
		System.out.println(class1);

		Client anonymousClientClazz = new Client() {
		};
		System.out.println(anonymousClientClazz.getClass().getDeclaringClass());
	}

	enum Enum {
		A, B;
	}
}
