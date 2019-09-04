# Oracle Tutorial

### Uses of reflection
Reflection is commonly used by programs which require the ability to examine or modify the runtime behavior of applications running in the Java virtual machine.

### Drawbacks of reflection
Performance Overhead: Because reflection involves types that are dynamically resolved, certain Java virtual machine optimizations can not be performed.

Security Restrictions: Reflection requires a runtime permission which may not be present when running under a security manager.

Exposure of Internals: Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.

## Classes
Every type is either a reference or a primitive.

`Class`es, `enum`s, and `array`s (which all inherit from `java.lang.Object`) as well as interfaces are all reference types.

For every type of object, the Java virtual machine instantiates an immutable instance of `java.lang.Class` which provides methods to examine the runtime properties of the object including its members and type information.

`Class` is the entry point for all of the Reflection APIs. 

## Retrieving Class Objects
The entry point for all reflection operations is `java.lang.Class`.

There are several ways to get a `Class` depending on whether the code has access to an object, the name of class, a type, or an existing Class.

### Object.getClass()
The simplest way to get a `Class` instance. It works for objects (arrays included), enums and interfaces.

### The .class Syntax
If the type is available but there is no instance then it is possible to obtain a Class by appending ".class" to the name of the type. 