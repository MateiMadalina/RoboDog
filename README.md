# RoboDog

## Overview

This project aims to create a RoboDog application using the Spring framework. The application allows users to interact with simulated dogs through HTTP requests. Dogs can be created randomly, added to the collection, and updated as needed. It is created as a learning experience with Spring, aiming to understand its functionalities and how to work with it for the first time.

## Features

- Create a new Spring project.
- Work with HTTP requests.
- Route with Spring.
- Respond differently based on the HTTP request method value.
- Organize the project into layers: model, service, controller.
- Check the endpoints using Postman.

## Setup

1. Clone the project repository.
2. Ensure that Maven is installed.
3. Build the project using Maven: `mvn clean install`.
4. Run the project: `mvn spring-boot:run`.

## Usage

### Endpoints

- `GET /dogs`: Retrieve all stored dogs.
- `GET /dogs/random`: Retrieve a randomly created dog.
- `POST /dogs`: Add a new dog to the collection.
- `PUT /dogs/{name}`: Update the first dog with the given name.


