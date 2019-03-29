# springboot-template

Spring Boot with JDK 11

## docker image creation
each build creates a a docker image with the tags ${version} and latest-snapshot 

run the docker image with

    docker run -p 8080:8080 examples/spring-boot-java11-template:latest-snapshot 

access the REST API via 

    localhost:8080/greeting/
    localhost:8080/greeting/?name=Horst

## Profiles

the profile release is used to tag a docker file as latest instead of latest-snapshot.
