# Spring-Tutorial

SPRING 

Aspect-Oriented Programming is breaking down program logic into distinct parts called concerns. The functions that span multiple points of an application are called cross-cutting concerns and these cross-cutting concerns are conceptually separate from the application's business logic.

Spring is a lightweight framework. It can be thought of as a framework of frameworks because it provides support to various frameworks such as Struts, Hibernate, Tapestry, EJB, JSF etc. It provides everything you need to embrace the Java language in an enterprise environment, with support for Groovy and Kotlin as alternative languages, and with the flexibility to create many kinds of architectures depending on an application’s needs.

The Inversion of Control (IoC)  
Dependency Injection is a concrete example of Inversion of Control. When writing a complex Java application, application classes should be as independent as possible of other Java classes to increase the possibility to reuse these classes and to test them independently of other classes while unit testing. Dependency Injection helps in gluing these classes together and at the same time keeping them independent. All this means, class B will get injected into class A by the IoC.

 Plain Old Java Object (POJO) is an ordinary Java object, not bound by any special restriction and not requiring any class path. 

The Spring container is at the core of the Spring Framework. The container will create the objects, wire them together, configure them, and manage their complete life cycle from creation till destruction. The Spring container uses dependency injection to manage the components that make up an application. These objects are called Spring Beans

A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. These beans are created with the configuration metadata that you supply to the container.

Autowiring happens by placing an instance of one bean into the desired field in an instance of another bean. Both classes should be beans, i.e. they should be defined to live in the application context. What is "living" in the application context? This means that the context instantiates the objects, not you.

Spring Batch provides reusable functions that are essential in processing large volumes of records, including logging/tracing, transaction management, job processing statistics, job restart, skip, and resource management.

Spring framework provides comprehensive infrastructure support for developing Java applications. It’s packed with some nice features like Dependency Injection and out of the box modules like:
•	Spring JDBC
•	Spring MVC
•	Spring Security
•	Spring AOP
•	Spring ORM
•	Spring Test
These modules can drastically reduce the development time of an application.

A Spring MVC is a Java framework which is used to build web applications. It follows the Model-View-Controller design pattern. 

Spring ORM (Object Relational Mapping) provides simplified templates for accessing databases through ORM technologies, such as Hibernate, JPA, JDO, and iBatis. For each of these technologies, Spring provides integration classes so that each technology can be used following Spring principles of configuration, and smoothly integrates with Spring transaction management.

Spring DAO (Data Access Object) - It's a design pattern in which a data access object (DAO) is an object that provides an abstract interface to some type of database or other persistence mechanisms.

Spring JDBC is an abstraction framework for JDBC that provides easier access to data sources without all the exception handling and parsing of SQL fetch results.

Spring AOP enables Aspect-Oriented Programming in spring applications. In AOP, aspects enable the modularization of concerns such as transaction management, logging or security that cut across multiple types and objects (often termed crosscutting concerns).
o	Advice is the action taken by an aspect at a particular join-point.
o	Joinpoint is a point of execution of the program, such as the execution of a method or the handling of an exception. In Spring AOP, a joinpoint always represents a method execution.
o	Pointcut is a predicate or expression that matches join points.
o	Advice is associated with a pointcut expression and runs at any join point matched by the pointcut.
There are five types of advice in spring AOP.
1.	Before advice: Advice that executes before a join point, but which does not have the ability to prevent execution flow proceeding to the join point (unless it throws an exception).
2.	After returning advice: Advice to be executed after a join point completes normally: for example, if a method returns without throwing an exception.
3.	After throwing advice: Advice to be executed if a method exits by throwing an exception.
4.	After advice: Advice to be executed regardless of the means by which a join point exits (normal or exceptional return).
5.	Around advice: Advice that surrounds a join point such as a method invocation. This is the most powerful kind of advice. Around advice can perform custom behavior before and after the method invocation. It is also responsible for choosing whether to proceed to the join point or to shortcut the advised method execution by returning its own return value or throwing an exception.
Spring Boot is basically an extension of the Spring framework which eliminated the boilerplate configurations required for setting up a Spring application. Spring Boot require less dependencies than Spring

@Configuration - Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.

@Bean - Indicates that a method produces a bean to be managed by the Spring container.

ApplicationContext - is a central interface to provide configuration for an application

ClassPathXmlApplicationContext - Create a new ClassPathXmlApplicationContext, loading the definitions from the given XML file and automatically refreshing the context.

AnnotationConfigApplicationContext - Create a new AnnotationConfigApplicationContext, deriving bean definitions from the given annotated classes and automatically refreshing the context.

@Service - Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design as "an operation offered as an interface that stands alone in the model, with no encapsulated state."

@Repository annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.

@Profiles provide a way to segregate parts of your application configuration and make it be available only in certain environments.

@Entity - Specifies that the class is an entity. This annotation is applied to the entity class.

@Component is responsible for some operations in Spring.
1.	@Service
2.	@Repository
3.	@Controller
