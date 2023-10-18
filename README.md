# [Cinema Room REST Service](https://hyperskill.org/projects/189)

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Usage](#usage)
- [Feedback](#feedback)
- [Contributing](#contributing)
- [Dependencies](#dependencies)
- [Contact Information](#contact-information)

## Description

This README provides an overview of the Cinema Room REST Service project implemented in Java. The project aims to create a simulated cinema booking system with a RESTful API. It allows users to view available seats, purchase tickets, return tickets, and retrieve statistics about cinema occupancy and revenue.

The Cinema Room REST Service project is a practical representation of real-world scenarios where cinemas offer services to customers. It is a RESTful web service designed to manage various aspects of cinema operations, including viewing available seats, purchasing tickets, returning tickets, and providing statistics on cinema occupancy and current revenue.

## Features

The Cinema Room REST Service project offers the following features:

- **Viewing Available Seats**: Users can access the service to view the available seats in the cinema.
- **Purchasing Tickets**: Customers can purchase tickets for available seats. Upon purchase, they receive a unique token associated with their ticket.
- **Returning Tickets**: If a customer decides to return a ticket, they can use their unique token to return the ticket and receive a refund.
- **Statistics**: The service provides statistics on cinema occupancy and current income.

## Usage

### To use the Cinema Room REST Service Application, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA or Eclipse).
3. Build and run the project.
4. Interact with the service using HTTP clients or web browsers to access various endpoints such as viewing available seats, purchasing tickets, returning tickets, and retrieving statistics.

### To create a JAR file for the Cinema Room REST Service project, perform the following steps:

1. Open the project in your Java IDE.
2. Build the project to compile the source code.
3. Generate a JAR file by exporting the project. In IntelliJ IDEA, go to `File > Project Structure > Artifacts`, then click the `+` button and choose `JAR > From modules with dependencies`. Select the main class for your application and choose to include the required libraries.
4. Configure the JAR build settings, such as specifying the main class and output directory.
5. Build the JAR file, which will be generated in the specified output directory.

### To run the JAR file, perform the following steps:

1. Open a terminal or command prompt on your computer.
2. Navigate to the directory where the JAR file is located using the `cd` command.
3. Run the JAR file using the `java -jar` command followed by the JAR file's name. For example:
```shell
java -jar cinema-room-rest-service.jar
```
4. The Cinema Room REST Service application will start, and you can access it through your web browser or an HTTP client.

## Feedback

The Cinema Room REST Service project provided a valuable learning experience in building a Spring-based REST service to manage a small movie theater. It allowed me to gain practical insights into handling HTTP requests, creating controllers and services, and responding with JSON objects.

The project's objective of creating a service for managing a movie theater, including tasks like showing available seats, selling and refunding tickets, and displaying statistics, was both engaging and educational. It mimicked real-world scenarios and provided a hands-on opportunity to work with Spring and RESTful APIs.

Overall, this project enhanced my skills in web service development and exposed me to the principles of building RESTful services. It was a step towards realizing the dream of having a private movie theater, albeit in a digital form. Pass me the popcorn indeed!

## Contributing

Contributions to the Cinema Room REST Service project are welcome. If you would like to contribute, please follow these guidelines:

1. Clone the repository and create a new branch for your contributions.
2. Implement new features, fix bugs, or improve existing functionality.
3. Write unit tests to ensure the reliability of your code.
4. Submit a pull request for review.

Please make sure to provide clear and concise documentation for any changes you make.

## Dependencies

The Cinema Room REST Service project has the following dependencies:

- Java: The project is implemented in Java, so you need to have Java installed on your system.

Ensure that the necessary dependencies are installed or available before using the project.

## Contact Information

If you have any questions, suggestions, or feedback regarding the Cinema Room REST Service project, please contact:
- Project Developer: ```Daulet Toganbayev```
- Email: ```daulet.toganbayev@gmail.com```

Feel free to reach out with any inquiries or contributions. Your input is highly appreciated!