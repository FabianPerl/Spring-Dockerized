# Spring-Dockerized Project

## To run this project:

* `$ mkdir -p target/dependency && (cd target/dependency; jar -xf YOUR_JAR)`
* `$ docker build -t YOUR_CONTAINER_NAME .`
* `$ docker run -p 8080:8080 -t YOUR_CONTAINER_NAME`

## This Project has following services:
* `/members`: GET-Method - Returning all saved Family Members
* `/addMember`: POST Method - Consumes json with name + age to save a Family Member
* `/removeMember`: POST Method - Consumes json with name + age to remove a saved Family Member

