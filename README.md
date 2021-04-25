# Gang of Four Design Patterns

- ## Introduction

Design patterns are the best formalized practices a programmer can use to
solve common problems when designing an application or system.

Design patterns can speed up the development process by providing tested, proven
development paradigms.

Reusing design patterns help prevent subtle issues that cause major
problems, and it also improves code readability for coders and architects who
are familiar with the patterns.

# Widely used Design Patterns implemented in Java

- ## Creational Design Patterns

> **Abstract Factory:** Allows the creation of objects without specifying their concrete type.
> > **Factory:** Creates objects without specifying the exact class to create.
> > > **Prototype:** Creates a new object from an existing object.
> > > > **Singleton:** Ensures only one instance of an object is created.

- ## Structural Design Patterns

> **Adapter:** Allows for two incompatible classes to work together by wrapping an interface around one of the existing classes.
> > **Composite:** Takes a group of objects into a single object.
> > > **DAO:** allows us to isolate the application/business layer from the persistence layer using an abstract API.
> > > > **Decorator:** Allows for an object’s behavior to be extended dynamically at run time.
> > > > > **Facade:** Provides a simple interface to a more complex underlying object.
> > > > > > **Proxy:** Provides an object that acts as a substitute for a real service object used by a client. 

- ## Behavior Design Patterns

> **Front Controller:** provides a centralized request handling mechanism to handle all requests by a single handler.
> > **Interceptor:** Implements a specialized language.
> > > **Iterator:** Accesses the elements of an object sequentially without exposing its underlying representation.
> > > > **Observer:** Is a publish/subscribe pattern which allows a number of observer objects to see an event.
> > > > > **Strategy:** Allows one of a family of algorithms to be selected on-the-fly at run-time.

- ## Architectural Design Patterns
> **Model View Controller:** allows separating different responsibilities to different entities.
