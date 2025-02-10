# Hamcrest Test Automation

This repository was created by [Marco A. Cruz](http://www.linkedin.com/in/marco-a-cruz) and is dedicated to showcasing how to leverage [Hamcrest](https://hamcrest.org/) matchers in automated testing, particularly with Java. Hamcrest provides a rich set of matchers for creating clear, readable, and expressive assertions in your tests. It also supports many popular program languages.

**Learn how to get started with Hamcrest matchers with automateNow's [Hamcrest tutorials](https://automatenow.io/hamcrest-tutorials/)**.

## Overview
Hamcrest is a library of matchers for building test expressions. It allows for more expressive and readable test code, making it easier to understand what your tests are checking. This project includes:

- Examples of using Hamcrest matchers in various contexts.
- Custom matchers to extend Hamcrest's capabilities tailored to specific testing needs.

## Getting Started

**Prerequisites**
- Java 8 or higher
- Maven or Gradle for dependency management

**Dependencies**\
Add the following dependency to your project's ```pom.xml``` (for Maven) or ```build.gradle``` (for Gradle) to use Hamcrest:

**Maven**
```
<dependency>
    <groupId>org.hamcrest</groupId>
    <artifactId>hamcrest</artifactId>
    <version>3.0</version> <!-- Check for the latest at https://mvnrepository.com/artifact/org.hamcrest/hamcrest -->
    <scope>test</scope>
</dependency>
```

**Gradle**
```
testImplementation 'org.hamcrest:hamcrest:3.0' // Adjust version as needed
```

## Usage

**1. Clone the Repository:**
```
git clone https://github.com/automatenow/hamcrest-matchers.git
cd hamcrest-matchers
```

**2. Explore Examples:** Navigate through the ```src/test``` directory to see different usages of Hamcrest matchers including custom matches.

**Run Tests:** Execute the tests to see how the Hamcrest matchers perform. Use your build tool:
- Maven\
  ```mvn test```

- Gradle\
  ```./gradlew test```

## License
This project is licensed under the MIT License - see the LICENSE file for details.
