# Task List Application

This is a Task List application built using the Play Framework in Scala. It provides functionalities for user signup, login, logout, and managing tasks.

## Prerequisites

- Java 8 or higher
- sbt (Scala Build Tool)
- Play Framework

## Project Structure
├── app
│ ├── controllers
│ │ └── TaskList1.scala
│ ├── models
│ │ └── TaskListInMemoryModel.scala
│ ├── views
│ │ ├── login1.scala.html
│ │ └── taskList1.scala.html
├── conf
│ ├── application.conf
│ ├── logback.xml
│ └── routes
├── public
│ ├── images
│ ├── javascripts
│ └── stylesheets
└── build.sbt


## Installation

1. git clone https://github.com/your-username/task-list-app.git
   cd task-list-app
2. sbt update
3 . sbt run
4. Access the application:

Open your web browser and go to http://localhost:9000.
