
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | FIRST_NAME LAST_NAME       |
| Date         | MM/DD/YYYY                 |
| Course       | Fall / Spring / Summer     |
| Assignment # |                            |

# Assignment Overview
The main goal of this assignment is to develop an email generation application based on design patterns. The application is designed to generate personalized email content for different types of customers to meet the needs of enterprises for customized communication. By creating an abstract Customer class and concrete subclasses (such as BusinessCustomer, VIPCustomer, etc.), the application is able to generate specific email content based on the customer type. At the same time, the factory pattern is applied to create different customer objects, which simplifies the object generation process and improves the scalability of the code.

In addition, this assignment also emphasizes the importance of object-oriented design and exception handling. During the implementation process, an email format validation mechanism is added to ensure that all email addresses are in a valid format. The test covers the email generation logic for all customer types and simulates the email sending process to ensure the reliability and stability of the system. Through this assignment, students can deeply understand how to apply design patterns in software development and solve real business needs in an object-oriented way.

# GitHub Repository Link:
https://github.com/HaonanChen-2024/cs-665-assignment--3-

# Implementation Description 

## Flexibility and Extensibility
The application is designed with a high degree of flexibility, allowing new customer types to be added with minimal code changes. By leveraging an abstract Customer class, the application enables easy addition of new customer types through inheritance. Each customer type only needs to implement the generateEmail() method to provide a unique, personalized email. To introduce a new customer type, developers can create a subclass extending Customer and implement the generateEmail() method without modifying the existing classes. The CustomerFactory class further supports this extensibility by using a factory pattern that enables centralized control over object creation. This ensures that new customer types can be seamlessly integrated into the system.

## Simplicity and Maintainability
This implementation prioritizes simplicity and clarity. By using an organized directory structure and separating each customer type into its own class, the code remains modular and easy to read. The CustomerFactory class centralizes the object creation process, reducing complexity and keeping instantiation code separate from business logic. The use of a StringConstants class to store all static strings, such as email bodies and greetings, keeps content organized and simplifies future updates. Additionally, meaningful class and method names make the code intuitive and accessible to other developers who may need to maintain or extend the application.

## Avoiding Code Duplication
To avoid code duplication, common functionality, such as email validation, is encapsulated in the Customer abstract class. Each specific customer type only implements unique aspects of their behavior (i.e., generateEmail()), while shared functionality remains in the superclass. Centralizing string content in StringConstants ensures that email content is not repeated across different classes, further reducing redundancy and enhancing maintainability. Avoiding duplicated code minimizes potential errors and makes the codebase more efficient, easier to test, and simpler to extend.

## Design Patterns Used
This implementation primarily utilizes the Factory and Template design patterns. The Factory Pattern is applied through the CustomerFactory class, which enables the creation of specific customer objects based on a given type. This pattern was chosen because it supports object-oriented principles by abstracting the instantiation process, thus making the code flexible and open to extension. The Template Pattern is demonstrated through the Customer abstract class, which defines a common template that all customer types follow while allowing subclasses to implement unique email content. These design patterns were selected to enhance code reusability, maintainability, and scalability, ensuring the application is adaptable to future requirements.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




