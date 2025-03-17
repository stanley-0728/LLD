# LLD (Low-Level Design) Repository

## Overview
This repository covers all **23 design patterns** from the **Gang of Four (GoF)**, providing explanations of their **purpose, what they solve, and when to use them**. Additionally, it includes **problem-solving exercises** to apply these design patterns in real-world scenarios.

## Repository Structure
```
/lld
│── creational/          # Creational design patterns
│── structural/          # Structural design patterns
│── behavioral/          # Behavioral design patterns
│── problems/            # Real-world problem-solving using design patterns
│── README.md            # Documentation
```

## Design Patterns Covered
### 1. Creational Patterns (Object Creation Mechanisms)
| Pattern | Purpose | When to Use |
|---------|---------|-------------|
| **Singleton** | Ensures a class has only one instance and provides a global point of access. | When you need a single shared resource (e.g., logging, database connection). |
| **Factory Method** | Provides an interface for creating objects but lets subclasses alter the type. | When object creation logic should be encapsulated in a separate class. |
| **Abstract Factory** | Provides an interface for creating families of related objects without specifying concrete classes. | When multiple related objects need to be created consistently. |
| **Builder** | Separates object construction from representation, improving readability. | When an object has a complex construction process. |
| **Prototype** | Creates new objects by copying an existing object. | When object creation is costly, and copying is more efficient. |

### 2. Structural Patterns (Class & Object Composition)
| Pattern | Purpose | When to Use |
|---------|---------|-------------|
| **Adapter** | Converts the interface of a class into another interface that a client expects. | When two incompatible interfaces need to work together. |
| **Bridge** | Decouples an abstraction from its implementation so they can vary independently. | When different implementations should not affect abstraction changes. |
| **Composite** | Allows treating individual objects and compositions of objects uniformly. | When part-whole hierarchies should be treated the same. |
| **Decorator** | Dynamically adds behavior to objects without modifying their code. | When you need to extend an object's functionality dynamically. |
| **Facade** | Provides a simplified interface to a complex subsystem. | When simplifying interaction with a complex system. |
| **Flyweight** | Minimizes memory usage by sharing data between similar objects. | When dealing with a large number of similar objects. |
| **Proxy** | Provides a placeholder for another object to control access. | When controlling access to expensive objects. |

### 3. Behavioral Patterns (Object Interaction & Responsibility)
| Pattern | Purpose | When to Use |
|---------|---------|-------------|
| **Chain of Responsibility** | Passes requests along a chain of handlers. | When multiple handlers should be able to process a request. |
| **Command** | Encapsulates requests as objects, allowing parameterization and queuing. | When you need to log, queue, or undo operations. |
| **Interpreter** | Defines a grammar and interprets sentences in that grammar. | When building a language interpreter or query language. |
| **Iterator** | Provides a way to access elements sequentially without exposing details. | When traversing complex data structures. |
| **Mediator** | Reduces direct communication between objects by centralizing it. | When objects should not directly reference each other. |
| **Memento** | Captures and restores an object's state without exposing its implementation. | When implementing undo/redo functionality. |
| **Observer** | Defines a one-to-many dependency between objects. | When an object state change should notify multiple dependents. |
| **State** | Allows an object to change behavior when its internal state changes. | When object behavior depends on state changes. |
| **Strategy** | Defines a family of interchangeable algorithms. | When you need different algorithms for a task at runtime. |
| **Template Method** | Defines a skeleton algorithm with steps that subclasses can override. | When algorithm steps should be reusable but allow customization. |
| **Visitor** | Lets you add new operations to objects without modifying them. | When you need to extend existing class behavior without modifying them. |

## Problem-Solving with Design Patterns
Apart from theoretical knowledge, this repository includes **real-world problem-solving** to demonstrate how design patterns can be applied effectively.

### Example Problems
- Implementing a **thread-safe** Singleton Logger.
- Designing a **payment processing system** using the Strategy pattern.
- Creating a **notification service** that supports email, SMS, and push notifications via the Observer pattern.
- Building a **file system hierarchy** using the Composite pattern.


1. **Navigate through the folders** to explore each design pattern.
2. **Run example implementations** to see them in action.
3. **Solve provided problems** to gain hands-on experience.

## Contribution Guidelines
- Feel free to **add new examples** or improve existing ones.
- If you find any errors, submit a **pull request** or open an **issue**.


---
📌 **Happy Coding! 🚀**
